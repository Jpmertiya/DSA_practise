import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,2,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclic(int[] arr){
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=i+1){
            swap(arr,i,arr[i--]-1);
           }
        }
    }
    public static void swap(int[] arr,int a,int b){
        arr[a]+=arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    }
}
