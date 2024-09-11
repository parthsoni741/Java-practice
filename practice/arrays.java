package practice;

public class arrays {
    public static void main(Strings[] args) {
        int ar[]=new int[20];
        int n = 0;
        for (int i = 0; i < 20; i++) {
            ar[i]=i;
        }
//        for (int i = 0; i < 20; i++) {
//            System.out.println(ar[i]);
//        }

        for(int a :ar){
            System.out.println(a);
        }
        for(int j = 0; j < 20; j++) {
            n = n + ar[j];
        }
        System.out.println("sum is: " +n);
        System.out.println("array length is: " +ar.length);



    }
}
