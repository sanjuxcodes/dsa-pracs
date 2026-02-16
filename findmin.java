public class findmin {
    static int findd(int arr[]){

        int l=0;
        int h=arr.length-1;

        while(l<=h){
            if(arr[l]<arr[h]){
                return arr[l];
            }

            int m=(l+h)/2;

            if(arr[m]>arr[h]){
                l=m+1;
            }

            else{
                h=m;
            }

        }


        return arr[l];
    }
    
}
