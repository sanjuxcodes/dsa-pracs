public class zero {
    static int[] findd(int arr[]){

        int j =0;
        for(int i =0; i< arr.length; i++){
            if(arr[i] !=0){
                arr[j++]=arr[i];
            }

        }

        for(int i =j;i<arr.length;i++){
            arr[i]=0;
        }

        return arr;

    }
    public static void main(String[] args) {
        int arr[]={1,0,2,3,0};
        findd(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
