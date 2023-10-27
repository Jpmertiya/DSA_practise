public class BinarySearch_Alpha {
    public static void main(String[] args) {
        char[] c={'a','b','c','e','l'};
        char target='b';
        char res=indNxt(c,target);
        System.out.println(res);
    }

    public static char indNxt(char[] arr,char target){
        int start=0,end=arr.length-1,mid;

        while(start<=end){
            mid= start+(end-start)/2;

            if (arr[mid]<=target)
                start=mid+1;
            else
                end=mid-1;
        }
        if (arr[start]>target)
            return arr[start];
        return arr[0];

    }


}
