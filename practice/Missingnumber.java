package practice;

public class Missingnumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9,10};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);
        int oursum=0;
        for (int i = 0; i < arr.length; i++) {
            oursum+=arr[i];
        }
        int requiredsum= (max*(max+1))/2;
        System.out.println("missing number is: " +(requiredsum-oursum));
    }
}
