public class dutch {
    static int[] findd(int arr[]){
        int n =arr.length;

        int l=0;
        int r=n-1;

        int m=0;

        while(m<=r){
            if(arr[m]==1){
                m++;

            }
            else if(arr[m]==0){
                int t=arr[l];
                arr[l]=arr[m];
                arr[m]=t;

                l++;
                m++;


            }

            else if(arr[m]==2){
                int t=arr[m];
                arr[m]=arr[r];
                arr[r]=t;

                r--;
            }
        }


        return arr;
    }
    
}
