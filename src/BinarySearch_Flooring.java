public class BinarySearch_Flooring {
    static public void main(String[] args) throws Exception{
        int a=ceiling(new int[]{2,4,6,9,16,21,88},20);
        System.out.println(a);
    }

    public static int ceiling(int[] arr,int target){
        int start=0,end=arr.length-1,mid;
        while (start<=end){

            mid=(int)(start+(end-start)/2);

            if (arr[mid]==target)
                return arr[mid];

            if (arr[mid]<target){
                start=mid+1;
            }
            if (arr[mid]>target){
                end=mid-1;
            }

        }


        return arr[start];
    }
}
