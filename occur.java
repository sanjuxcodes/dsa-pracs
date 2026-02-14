public class occur {

    static int findd(int arr[], int k){

        int l=0;
        int h=arr.length-1;
        int a=0;

        while(l<=h){

            int m=(l+h)/2;


            if(arr[m]==k){
                a=m;
                h=m-1;


            }
            else if(arr[m]<k){
                l=m+1;
            }
            else
                h=m-1;

        }
        return a;
    }
    
}
