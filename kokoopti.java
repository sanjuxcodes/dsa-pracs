public class kokoopti {
    static int findd(int arr[],int h){


        int low =1;
        int high=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>high){
                high=arr[i];
            }
        }

        while(low<=high){
            int mid=(low+high)/2;//curr spd
            long th=0;
            for(int i=0;i<arr.length;i++){
                th+=(arr[i]+mid-1)/mid; //ceil div 

            }
            if(th<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return low;

    }
    
}
