public class firstAndLastPosition {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int[] ans=calc(arr,8);
        System.out.print(ans[0]+" "+ans[1]);
    }
    public static int[] calc(int[] arr,int target)
    {
        int n=arr.length;
        int low=0;
        int high=n-1;
        boolean flag=false;
        int[] res={-1,-1};
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                flag=true;
                break;
            }
            else if(target>arr[mid])
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        if(flag==false) return res; 
                          
 
        low=0;
        high=n-1;
        int lb=n;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>=target)
            {
                    lb=Math.min(lb,mid);
                    high=mid-1;
            }  
            else{
                low=mid+1;
            }         
        }
        res[0]=lb;

        low=0;
        high=n-1;
        int ub=n;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>target)
            {
                    ub=Math.min(ub,mid);
                    high=mid-1;
            }  
            else{
                low=mid+1;
            }         
        }
        res[1]=ub-1;

        return res;
    }
}

