import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        String s="258712";
        int arr=Integer.parseInt(s);
        int[] arr1=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr1[i]=arr%10;
            arr/=10;
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println("after sorting array");
        sort(arr1);
        System.out.println(Arrays.toString(arr1));
        for(int i=arr1.length-1;i>0;i--){
            if (arr1[i]%2!=0)
            {
                System.out.println("highest element is "+arr1[i]);
                break;
            }
        }

    }
    public static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1])
                    swap(arr,j,j-1);
                else
                    break;
            }
        }
    }
    public static void swap(int[] arr,int a,int b){
        arr[a]+=arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    }

}
