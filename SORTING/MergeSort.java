public class MergeSort {
    public static void print(int[] arr)
        {
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        public static void merge(int[] a,int[] b,int[] c)
        {
            int i=0,j=0,k=0;
            while(i<a.length && j<b.length)
            {
                if(a[i]<=b[j])
                {
                    c[k]=a[i];
                    i++;
                    k++;
                }
                else{
                    c[k]=b[j];
                    j++;
                    k++;
                }

            }
            while(i<a.length)
            {
                c[k]=a[i];
                i++;
                k++;
            }
            while(j<b.length)
            {
                c[k++]=b[j++];
            }
        }
        public static void mergeSort(int[] arr)
        {
            if(arr.length==1) return;
            int n= arr.length;
            int[] a=new int[n/2];
            int[] b=new int[n-n/2];
            for(int i=0;i<n/2;i++)
            {
                a[i]=arr[i];
            }
            for(int i=0;i<n-n/2;i++)
            {
                b[i]=arr[i+n/2];
            }
            mergeSort(a);
            mergeSort(b);
           
            merge(a,b,arr);

        }
        public static void main(String[] args) {
            int[] arr={80,75,20,5,15,39,100};
            
            print(arr);
            mergeSort(arr);
            System.out.println();
            print(arr);
            System.out.println();
            
        }
}
