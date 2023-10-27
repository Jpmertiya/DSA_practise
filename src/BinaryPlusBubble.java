class BinaryPlusbubble{
    
     static public void main(String[] args) throws Exception{
          int[] arr={1,2,3,4,5,6};
          System.out.println(binary(arr,7));
     }
     public static int binary(int[] arr,int target){
          int[] arr1=sort(arr);
          int start=0,end=arr.length-1,mid;
          while(start<=end){
               mid=start+(end-start)/2;
               if(arr1[mid]==target)
               return arr1[mid];
               else if(mid<end && arr1[mid]<target){
                    start=mid+1;
               }
               else
                    end=mid-1;
          }
          return -1;
     }
     public static int[] sort(int[] arr){
          boolean isSort=false;
          for(int i=0;i<arr.length;i++){
               isSort=false;
               for(int j=1;j<arr.length-i;j++){
                    if(arr[j]<arr[j-1]){
                         arr[j-1]+=arr[j];
                         arr[j]=arr[j-1]-arr[j];
                         arr[j-1]-=arr[j];
                         isSort=true;
                    }
               }
               if(!isSort)break;
          }
          return arr;
     }
}