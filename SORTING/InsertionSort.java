public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={10,-7,-8,5,99,0};
        int n=arr.length;
        print(arr);
        System.out.println();
        for (int i = 1; i < n; i++) {
            for (int j = i; j>0 ; j--) {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
        print(arr);
    }

    public static void swap(int[] a,int i,int j)
    {
        int temp=a[j];
        a[j]=a[i];
        a[i]=temp;
    }

    public static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
