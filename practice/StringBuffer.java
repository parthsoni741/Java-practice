package practice;

public class StringBuffer {
    public static void main(String[] args) {
        java.lang.StringBuffer sb = new java.lang.StringBuffer("hi");
        //append
        sb.append(" hello");
        System.out.println(sb);

        //insert
        sb.insert(2,123);
        System.out.println(sb);

        //reverse
        sb.reverse();
        System.out.println(sb);

        //replace
        sb.replace(2,6,"afsadf");
        System.out.println(sb);
    }
}
