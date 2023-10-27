public class BinarySearch_InfinateArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66};
        int r=ans(arr,43);
        System.out.println(r);
    }

    public static int ans(int[] arrr,int targer){
        int start=0,end=1;

        while (targer>arrr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySeach(arrr,targer,start,end);

    }

    public static int binarySeach(int[] arr,int target,int start,int end){
       int mid=0;
        while (start<end){
            mid=start+(end-start)/2;
            if (arr[mid]>target){
                end=mid-1;
            }
            else if (arr[mid]<target){
                start=mid+1;
            }
            else return arr[mid];
        }
        return -1;

    }


}
