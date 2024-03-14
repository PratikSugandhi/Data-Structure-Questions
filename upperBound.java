public class upperBound {
    public static void main(String[] args) {
        int[] arr={1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 7, 8, 9};
        int n=arr.length;
        int target=3;
        int ub=n;
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>target)
            {
                ub=Math.min(mid, ub);
                high=mid-1;
            }
            else{
                low=mid+1;

            }
        }
        System.out.println("The lower bound of "+target+"is "+ub);
    }
}
