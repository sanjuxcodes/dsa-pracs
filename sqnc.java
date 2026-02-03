public class sqnc {
    static int[] find(int arr[],int d){
        int n=arr.length;
        d=d%n;
        int temp[]=new int [d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];

        }

        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];

        }
        int j=0;
        for(int i=n-d;i<n;i++){
            arr[i]=temp[j];
            j++;
        }




        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        find(arr, 4);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
