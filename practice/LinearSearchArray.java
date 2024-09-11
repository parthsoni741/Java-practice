package practice;
import java.util.*;
public class LinearSearchArray {
    public static void main(Strings[] args) {
        int a=20;
        int[] ar=new int[a];
        Random random=new Random();
        for (int i = 0; i < a; i++) {
            ar[i]= random.nextInt(100);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(ar[i]+ " ");
        }
        int check=2;
        System.out.println();
        System.out.println("check for: " +check);
        boolean v = false;
        for (int i = 0; i < 20; i++) {
            if (check==ar[i]){
                v=true;
            }
        }
        System.out.println();
        System.out.println(v);
    }
}
