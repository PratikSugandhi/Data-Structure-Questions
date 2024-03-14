public class SmallerOrEqualElement {
    public static int solve(int[] A, int B) {
        int low=0,high=A.length-1,count=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(A[mid]<=B)
            {
                count=mid+1;
                low=mid+1;
            }
            else high=mid-1;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,2,7,8,14,52};
        int ans=solve(arr, 8);
        System.out.println(ans);
    }
}
