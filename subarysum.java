public class subarysum {
    static int findd(int arr[],int k){
        int n=arr.length;
        int l=0;
        
        int sum=0;
        

        int mx=0;


        for(int i=0;i<n;i++){
            sum+=arr[i];
            

            if(sum==k){
                mx=Math.max(mx, i-l+1);

                

            }
            while(sum>k){
                sum-=arr[l];
                l++;
            }
        }
        return mx;
    }
    
}
