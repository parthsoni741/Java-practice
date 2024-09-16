package practice;

public class CompareTwoString {
    public static void main(String[] args) {
        String s12= "hello";
        String s13= "hi";
        String s14= "hello";
        int q=s13.compareTo(s12);
        System.out.println(q);

        //equals
        System.out.println(s12.equals(s14));
    }
}
