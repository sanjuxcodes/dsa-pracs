public class kadanae {
    static int findd(int arr[]){
        int sum=arr[0];
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            max=Math.max(sum, max);

            if(sum<0){
                sum=0;
            }
            if(max<0){
                max=0;
            }
        }

        return max;
    }
    
}
