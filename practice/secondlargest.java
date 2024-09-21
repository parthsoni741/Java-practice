package practice;

public class secondlargest {
    public static void main(String[] args) {
        int[] arr ={10,29,39,92,11};
        int max= Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                smax=max;
                max= arr[i];
            }
            else if (arr[i] > smax && arr[i] != max){
                smax= arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
