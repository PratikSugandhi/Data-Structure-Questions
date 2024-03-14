public class Sqrt {
    public static int mySqrt(int x) {
        long low=1;
        long high=x;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            if(mid*mid==x) return (int)mid;
            else if((long)x>mid*mid)  low=mid+1;
            else  high=mid-1;
        }
        return (int)high;
        
    }
    public static void main(String[] args) {
        int ans=mySqrt(24);
        System.out.println(ans);
    }
}
