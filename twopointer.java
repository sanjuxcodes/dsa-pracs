public class twopointer {
    static void rmvduplc(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){

            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;

            }
        }
        for(int j=0;j<i+1;j++){
            System.out.println(arr[j]);
        }
        //return  i+1;
    }
    
    public static void main(String[] args) {
        
        int arr[]={1,22,22,33,33,33};
        rmvduplc(arr);
    }

}