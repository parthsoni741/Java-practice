package practice;

public class RemoveCharInString {
    public static void main(String[] args) {
        String ss= "hello my name is parth soni";
        String res=ss.replace("a", "");
        System.out.println(res);
        res=res.replace("h","");
        System.out.println(res);
    }
}
