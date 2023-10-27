public class BinarySearch_mountinArray {
    public static void main(String[] args) {
         int[] arr={1,2,3,4,5,6,7,8,9};
        int ans=binarySearch(arr);
        System.out.println(ans);

    }

    public static int binarySearch(int[] arr){
        int mid,start=0,end=arr.length-1;

        while (start<end){
            mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end=mid;
            }
            else if (arr[mid]<arr[mid+1]){
                start=mid+1;
            }

        }

        return arr[start];
    }


}
