public class pushzero {

    static void pshh(int arr[]){

        int j=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;

            }}

        for (int i = j; i < arr.length; i++) {
            arr[i]=0;


            
        }





            for (int k = 0; k < arr.length; k++) {
                System.out.println(arr[k]);
                
            }
        }



    
    public static void main(String[] args) {
        int arr[]={0,1,0,2,3,5,0,8};

        pshh(arr);
    }
    
}
