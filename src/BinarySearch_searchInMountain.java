public class BinarySearch_searchInMountain {

    public static void main(String[] args) {

    int[] arr={1,3,4,6,7,9,8,6,4,2,0};
    int res=findTarget(arr,6);
        System.out.println("index of number is "+res);

    }


    public static int findTarget(int[] arr,int target){
        int t=peekOfMountain(arr);
        int first=bS(arr,target,0,t,true);
        if (first!=-1){
            return first;
        }else {
            int second=bS(arr,target,t+1,arr.length,false);
             if (second!=-1){
                 return second;}
        }
        return -1;
    }

    public static int peekOfMountain(int[] arr){
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

        return start;
    }

    public static int bS(int[]arr, int target,int start,int end,boolean isAsc){
        int mid;
        while (start<=end){
            mid=start+(end-start)/2;
            if (isAsc){
                if (target>arr[mid]){
                    start=mid+1;
                }
                else if (target<arr[mid]){
                    end=mid-1;
                }
                else return mid;
            }else {
                if (target>arr[mid]){
                    end=mid-1;
                }
                else if (target<arr[mid]){
                    start=mid+1;
                }
                else return mid;
            }

        }
        return -1;
    }
}
