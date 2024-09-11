package practice;

public class Strings {
    public static void main(String[] args) {
        String s = new String("parth");
        String s1= "parth";
        String s2= "parth";
        String s3= "raj";
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        char[] arr={'p','a','r','t','h'};
        for(char c :arr) {
            System.out.print(c);
        }
        System.out.println();
        String d=new String(arr);
        System.out.println(d);
        //length
        System.out.println(d.length());

        //concatenation
        String a1="parth";
        String a2="soni";
        String a3=a1+" "+a2;
        System.out.println(a3);

        //toCharArray()
        char[] a4=a1.toCharArray();
        System.out.println(a4);
        for(char a:a4){
            System.out.print(a);
        }

        System.out.println();
        //charAt()
        System.out.println(a1.charAt(1));

        //compareTo()
        String s12= "hello";
        String s13= "hi";
        String s14= "hello";
        int q=s12.compareTo(s13);
        System.out.println(q);

        //equals
        System.out.println(s12.equals(s14));

        //contains
        String s15= "hello my name is parth soni";
        System.out.println(s15.contains("my"));

        //indexof
        System.out.println(s15.indexOf("l"));

        //replace
        String ss="Hello World";
        String res=ss.replace("Hello", "Bye");
        System.out.println(res);

        //substring
        String aa= "hello my name is parth soni";
        String ab=aa.substring(0,2);
        String ac=aa.substring(4);
        System.out.println(ab);
        System.out.println(ac);

    }
}
/*
the string object used with new keyword is made in both heap area and string constant pool &
string object made directly using literal(constant) will be stored only in scp(string constant
pool)
*/
