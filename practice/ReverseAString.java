package practice;

public class ReverseAString {
    public static void main(String[] args) {
        String s1= "hello my name is parth soni";
        char[] a=s1.toCharArray();


        int n= a.length;
        int m=n;
        char[] b= new char[n];
        for (int i = 0; i < n; i++) {
            b[m-1]=a[i];
            m--;
        }
        String s2=new String(b);
        System.out.println(s2);
    }
}
