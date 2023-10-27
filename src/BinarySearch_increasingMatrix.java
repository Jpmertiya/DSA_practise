import java.util.Arrays;

public class BinarySearch_increasingMatrix {

    public static void main(String[] args) {
        int[][] a={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target=0;
        int[] ans=increaseMatrix(a,target);
        System.out.println(Arrays.toString(ans));
    }


    private static int[] increaseMatrix(int[][] a, int target) {
        int r=0,c=a.length-1;
        while (r<a.length&& c>=0){
            if (a[r][c]==target)
                return new int[]{r,c};
            else if (a[r][c]<target)
                r++;
            else c--;
        }
        return new int[]{-1,-1};

    }


}
