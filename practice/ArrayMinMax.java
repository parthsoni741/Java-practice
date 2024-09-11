package practice;

public class ArrayMinMax {
    public static void main(Strings[] args) {
        int[] ar =new int[20];
        for (int i = 0; i < 20; i++) {
            ar[i]=i;
        }
        ar[3]=89;
        int min = ar[0], max = ar[0];
        for (int i = 1; i < 20; i++) {
            if(max<ar[i]){
                max=ar[i];
            }
        }
        for (int i = 1; i < 20; i++) {
            if(min>ar[i]){
                min=ar[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
