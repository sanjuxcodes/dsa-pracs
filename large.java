public class large{
    static int largg(int arr[]){
        int lar=arr[0];


        for(int i =1;i<arr.length;i++){
            if(lar<arr[i]){
                lar=arr[i];

            }


            
        }
        return lar;
    }
    static int seclargg(int arr[]){
        int lar=arr[0];
        int sec=Integer.MIN_VALUE;

        
        for(int i =1;i<arr.length;i++){
            if(lar<arr[i]){
                sec=lar;
                lar=arr[i];

            }
            else if(arr[i]<lar && sec<arr[i]){
                sec=arr[i];
            }


            
        }
        return sec;
    }

    static boolean  sortt(int arr[]){
        for(int i=0;i<arr.length-1;i++){

        if(arr[i]>arr[i+1]){
            return false;
        }}
        return true;



    }
    public static void main(String[] args) {

        int arr[]={1,3,2,10,33,21};
        int nrr[]={1,2,3,4,5};
        
        System.out.println(sortt(arr));
    }
}