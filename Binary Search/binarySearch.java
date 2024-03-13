public class binarySearch {
    public static void main(String[] args) {
        int[] arr={10,98,1456,78798,4578945,57894567};
        int n=arr.length;
        int target=10;
        int low=0,high=n-1;
        boolean flag=false;

        while (low<=high)
        {
            int mid=low+(high-low)/2;

            if(target>arr[mid])
            {
                low=mid+1;

            }
            else if(target<arr[mid])
            {
                high=mid-1;
            }
            else
            {
                flag=true;
                break;
            }
        }

        if(flag==true)
        {
            System.out.println("Elements found ");
        }
        else
        {
            System.out.println("Elements not found ");
        }
    }
}
