import java.util.Arrays;

class missingNumberSCyclicSort{
    public static void main(String[] args) {
        int[] arr={1,3,3,3,4,2,7,9,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                System.out.println(i+1+" :/");
            }
        }
    }

    public static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i] < arr.length &&arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }
    public static void swap(int[] arr ,int a,int b){
        arr[a]+=arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]-=arr[b];
    }
}