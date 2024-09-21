package practice;

public class LeaderinArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    break;
                }
            }
            if (j == size) {
                System.out.println(arr[i] + "is the leader");
            }
        }
        for (int k = 0; k < arr.length; k++) {
            boolean leader=true;
            for (int l = k+1; l < arr.length ; l++) {
                if(arr[k]<arr[l]){
                    leader=false;
                    break;
                }
            }
            if(leader) {
                System.out.print(arr[k] + " ");
            }
        }
        System.out.println();
        int[] arr1 = {18, 20, 16, 17, 4, 3, 5, 2};
        int s = arr1.length;
        int max = arr1[s-1];
        for (int i = s-1; i >=0 ; i--) {
            if(max<=arr1[i]){
                max=arr1[i];
                System.out.print(max+" ");
            }
        }
    }
}

