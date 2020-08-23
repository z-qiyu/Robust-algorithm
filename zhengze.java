package zqy;


public class zhengze{

    z(String re, String str){
        Pattern q = Pattern.compile(re);
        Matcher w = q.matcher(str);
        boolean b = w.matches();
        System.out.println(b);
    }

}
