package practice;
import java.util.*;

public class SecondLargestInArray {
    public static void main(Strings[] args) {
        int n=5;
        int[] arr = new int[n];
        Random random=new Random();
        for (int i = 0; i < n; i++) {
            arr[i]= random.nextInt(100);
        }
        for (int value :arr) {
            System.out.print(value+" ");
        }
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Second max is: "+arr[n-2]);
    }
}
