import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
         int[] arr=new int[]{2,4,5,6,9,8};
          System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean isSwaped;
          for (int i=0;i<arr.length;i++){
              isSwaped=false;
                for (int j=1;j< arr.length-i;j++){
                     if (arr[j]<arr[j-1]){
                          arr[j]=arr[j]+arr[j-1];
                          arr[j-1]=arr[j]-arr[j-1];
                          arr[j]=arr[j]-arr[j-1];
                          isSwaped=true;
                     }
                }
                if (!isSwaped)
                     break;
          }
   }
}
