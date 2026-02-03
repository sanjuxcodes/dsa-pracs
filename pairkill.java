public class pairkill {
    static int findd(int arr[]){

        int sum=0;

        for (int idx = 0; idx < arr.length; idx++) {

            sum^=arr[idx];
            
            
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,3,4,5,2,1};
        System.out.print(findd(arr));
    }
    
}
