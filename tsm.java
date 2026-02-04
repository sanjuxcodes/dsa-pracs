public class tsm {
    static int findd(int arr[],int t){
        int l=0;
        int r=arr.length-1;
        while(l<r){
        int sum=arr[l]+arr[r];
        if(sum==t){
            return 1;
        }
        else if(sum<t){
            l++;
        }
        else if(sum>t){
            r--;
        }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,7,9};
        System.out.print(findd(arr, 100));
    }
    
}
