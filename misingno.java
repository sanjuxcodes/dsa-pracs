public class misingno {
    static int findd(int arr[]){

        int sum=0;
        int n=arr.length;
        int exp= (n + 1) * (n + 2) / 2;
        for (int i = 0;i < n; i++){
            sum+=arr[i];
            
        }
        return exp-sum;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        System.out.println("no is: "+findd(arr));



    }
    
}
