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

        int[] arr1={10,29,39,92,11};
        int max= Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]>max){
                max=arr1[i];
            }
            else if (arr1[i]>smax) {
                smax=arr1[i];
            }
        }
    }
}
