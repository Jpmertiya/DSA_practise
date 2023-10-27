import java.util.Arrays;

public class BinraySearch_SrtedMatrix {

    public static void main(String[] args) {
        int[][] a={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}};
        int target=37;
        int[] ans=Binary2dSearch(a,target);
        System.out.println(Arrays.toString(ans));
    }
    private static int[] Binary2dSearch(int[][] a,int target) {
        int r=0,c=a.length-1;

        while (r<a.length && c>=0){
            if (a[r][c]==target)
                return new int[]{r,c};
            else if (a[r][c]>target)
                c--;
            else{
                r++;
            }
        }
        return new int[]{-1,-1};

    }
}
