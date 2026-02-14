public class floor {
    static int findd(int arr[],int k){


        int l =0;
        int h=arr.length-1;
        int a=-1;

        while(l<=h){

            int m=(l+h)/2;

            if(arr[m]<=k){

                a=arr[m];
                l=m+1;



            }

            else if(arr[m]>k){

            
                h=m-1;}
        }
        return a;

    }
    
}
