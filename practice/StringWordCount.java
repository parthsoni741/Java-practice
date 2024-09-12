package practice;

public class StringWordCount {
    public static void main(String[] args) {
        String ss= "hello my name is parth soni";
        int count=0;
        for (int i = 0; i < ss.length(); i++) {
            if(ss.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
