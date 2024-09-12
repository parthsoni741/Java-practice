package practice;

public class CharAppearanceInString {
    public static void main(String[] args) {
        String ss= "hello my name is parth and my surname is soni";
        char a = 'e';
        int count=0;
        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i)==a){
                count++;
            }
        }
        System.out.println("Appearance of character in the given string is " +count);
    }
}
