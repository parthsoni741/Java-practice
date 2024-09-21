package practice;

import java.util.Random;

public class Duplicates {
    public static void main(String[] args) {

        int[] arr= {1,2,3,5,6,8,5,2,3};
        int n=arr.length;
        for (int value :arr) {
            System.out.print(value+" ");
        }
        System.out.println();
        boolean b = false;
        System.out.print("Duplicates are ");
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j])
                {
                    b=true;
                    System.out.print(arr[j]+" ");
                }
            }
        }
        System.out.println();
        System.out.println(b);
    }
}
