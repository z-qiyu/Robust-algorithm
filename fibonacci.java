package zqy;

import java.util.Scanner;
import java.util.regex.*;


public class fibonacci {

	public fibonacci() {
	}
	public static void main(String[] args) {
		Scanner ipt=new Scanner(System.in);
		System.out.println("获取第n项斐波那契数列，n=");
		String k = ipt.nextLine();
		Pattern re = Pattern.compile("^-?\\d+(\\.\\d+)?$");
		
		//利用正则表达式，检测字符串k是否全部为数字。

		long fbncOne = 0;
		long fbncTwe = 1;
		long fbnc;
		
		while(!re.matcher(k).matches() || Double.valueOf(k.toString())%1!=0 || Double.valueOf(k.toString())<=0){   
		
			//检测字符串k是否为数字，如果字符串k为数字，则计算  k%1 != 0  ||  k<=o 如果都满足，则跳出循环，			
			
			System.out.println("输入必须是正整数，请重新输入：");
			k = ipt.nextLine();
		}
		double n= Double.valueOf(k.toString());
		
		//将k转换为double类型，用变量n储存，并进行计算。
		
		if(n==1) {
			System.out.print('0');
		}
		
		
		else if(n>=2) {
			System.out.println("0\n1");
			for(int i = 2; i < n; i++) {
				fbnc = fbncOne + fbncTwe;
				System.out.println(fbnc);
				fbncOne = fbncTwe;
				fbncTwe = fbnc;
				
			}
		}

	}

}
