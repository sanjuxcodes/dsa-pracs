public class seclarge {

    static int findd(int arr[]){

        int sec=Integer.MIN_VALUE;
        int lar=arr[0];

        for(int i =0;i<arr.length;i++){
            if(arr[i]>lar){
                sec=lar;
                lar=arr[i];

            }
            else if (arr[i]<lar && arr[i]>sec) {
                sec=arr[i];
                
            }
        }
        return sec;

    }
    public static void main(String[] args) {
        int arr[]={223,1,45,2,10};
        System.out.print(findd(arr));
        
    }
    
}
