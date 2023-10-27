import java.util.Arrays;

public class missingNumberCyclicSort {
    
    public static void main(String[] args) {
        int[] arr={3,5,0,2,1};
        sort(arr);
        System.out.println("hariom");
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                System.out.println("missing number is :"+ i);
            }
        }
    }

    public static void sort(int[] arr){

        int i=0;
        while(i<arr.length){
            
            if(arr[i]<arr.length && i!=arr[i] ){
                swap(arr,i,arr[i]);
            }else{
                i++;
            }
        }
    }
    public static void swap(int[] arr, int a,int b){
        arr[a]+=arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]-=arr[b];
    }
}
