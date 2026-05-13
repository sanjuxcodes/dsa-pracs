
class Dright{
    public static void main(String[] args) {

        int arr[]={1 ,2, 3, 4,5};

        int d=2;

       

        int n= arr.length;
        d=d%n;

        int temp[]= new int[d];
        int l=0;

        for(int i = n-d;i<n;i++){
            temp[l]=arr[i];
            l++;
        }
        for(int i= n-d-1;i>=0;i--){
            arr[i+d]=arr[i];
        }
        for(int i=0;i<d;i++){
            arr[i]=temp[i];
        }

        for(int i : arr){
            System.out.println(i);
        }


        
    }

}
