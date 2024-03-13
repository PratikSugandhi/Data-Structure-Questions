public class BubbleSort {
    public static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }


    public static void main(String[] args) {
        int[] arr={11,1,7,6};
        int n=arr.length;
        print(arr);
        System.out.println();
        boolean flag=true;
        for (int i = 0; i <n-1 ; i++) {   // it's for number of pases
            for (int j = 0; j < n-1-i; j++) {     //// it's for traversing
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flag=false;
                }
            }
            if (flag==true) break;
        }
        print(arr);
    }
}
