package practice;

import java.util.Random;

public class ReverseArray {
    public static void main(Strings[] args) {
        int a=20;
        int[] ar =new int[a];
        Random random=new Random();
        for (int i = 0; i < 20; i++) {
            ar[i]= random.nextInt(100);
        }
        for(int c :ar){
            System.out.print(c + " ");
        }
        System.out.println();
        int c = 20;
        int[] b =new int[a];
        for (int i = 0; i < 20; i++) {
            b[c-1] = ar[i];
            c--;
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(b[i]+ " ");
        }
    }
}
