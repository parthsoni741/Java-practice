package practice;

import java.util.Locale;

public class StringPalindromeCheck {
    public static void main(String[] args) {
        /*String s1= "hello my name is parth soni";
        char[] a=s1.toCharArray();
        int n= a.length;
        System.out.println(n);
        if(n==0){
            char[] b=new char[n];
            for (int i = 0; i < n/2; i++) {

            }
        }
        else{*/
        String s1="parth";
        String s2 ="";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        System.out.println(s2);
        System.out.println(s1.equals(s2));

        String s3="haahaah";
        s3=s3.toLowerCase();
        System.out.println(s3);
        
        int i=0, j=s3.length()-1;
        Boolean b=false;
        while (i<j){
            if(s3.charAt(i)!=s3.charAt(j)){
                b=true;
                i++;
                j--;
            }

        }
        System.out.println(b);
    }
}
