public class BinarySearch_RotatedArray {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,8,9,10,11,1,2};
        int target=8;
        int a=findpivot(arr);
        System.out.println(arr[a]);
        if (arr[0]<target){
            System.out.println(binarySearch(arr,target,0,a-1));
        }
        else if (target==arr[a])
            System.out.println(arr[a]);
        else {
            System.out.println(binarySearch(arr,target,a+1,arr.length-1));
        }
    }
      private static int findpivot(int[] arr) {
        int start=0,end=arr.length-1,mid;
        while (start<end){
            mid=start+(end-start)/2;
            if (mid<end && arr[mid]>arr[mid+1])
                return mid;
             if(mid>start && arr[mid-1]>arr[mid])
                return mid-1;
             if (arr[mid]<=arr[start]){
                end=mid-1;
            }
            else {
               start=mid+1;
            }

        }
        return -1;
    }

    public static int binarySearch(int[] arr ,int targer,int start,int end){
        int mid;
        while (start<=end){
            mid=start+(end-start)/2;
            if (arr[mid]>targer){
                end=mid-1;
            }
            else if (arr[mid]<targer){
                start=mid+1;
            }
            else return mid;
        }
        return -1;
    }
}
