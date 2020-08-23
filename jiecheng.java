package zqy;

import java.util.Scanner;
import java.util.regex.*;

public class jiecheng{

	public jiecheng() {
	
	}
	public static void main(String [] args) {
		Scanner ipt=new Scanner(System.in);
		System.out.println("n的阶层");
		String i=ipt.nextLine();
		Pattern e = Pattern.compile("[0-9]+");
		while(!e.matcher(i).matches() || Double.valueOf(i.toString())<=0 || Double.valueOf(i.toString())%1!=0){
			System.out.print("输入错误！请输入大于零的整数：");
			i = ipt.nextLine();
		}
		long p = Long.valueOf(i.toString());
		long m = p;
		System.out.print("------------------------------\n");
		for(long n=p-1; n>0; n=n-1) {
			System.out.print(p+"x"+n+"=");
			p=p*n;
			System.out.println(p);
		}
		System.out.print("--------------------------------\n");
		System.out.print(m+"的阶乘为"+p+"\n");
		System.out.print("--------------------------------");
	}
	
}
