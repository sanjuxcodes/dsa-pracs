public class xx {
    static int findd(int arr[],int k){

        int l=0;
        int r=0;
        int sum=0;
        int maxlen=0;
        while(r<arr.length){
            sum+=arr[r];
            while(sum>k){
                sum-=arr[l];
                l++;

            }
            if(sum==k){
                maxlen=Math.max(maxlen, r-l+1);
            }
            r++;
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,3,3};
        System.out.print(findd(arr, 6));
    }
}
