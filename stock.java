public class stock {

    static int findd(int arr[]){

        int minprice=Integer.MAX_VALUE;
        int maxprft=0;
        
        int prft=0;
        for(int i=0;i<arr.length;i++ ){
            if(arr[i]<minprice){
                minprice=arr[i];
                j=i;

            }
            prft=arr[i]-minprice;

            maxprft=Math.max(prft, maxprft);

        }

           




        



        return maxprft;
    }
    
}
