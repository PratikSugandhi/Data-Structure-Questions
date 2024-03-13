public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={10,8,5,-1,-9};
        int n= arr.length;

        print(arr);
        System.out.println();

        for (int i = 0; i < n-1; i++) {     // for n-1 passes.
            int idx=-1;
            int mx=Integer.MAX_VALUE;

            for (int j = i; j <n ; j++) {  // for traversing in arr from index i to last index
                if(arr[j]<mx)
                {
                    mx=arr[j];
                    idx=j;
                }
            }
            swap(arr,i,idx);
        }

        print(arr);
    }

    public static void swap(int[] a,int x,int y)
    {
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }

    public static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
