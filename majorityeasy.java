public class majorityeasy {
    static int findd(int arr[]){

        int cnt=0;
        int candidate=0;
        for(int i=0;i<arr.length;i++){
            if(cnt==0){
                candidate=arr[i];
                


            }

            if(candidate==arr[i]){
                cnt++;
            }
            else
                cnt--;

        }

        return candidate;
    }
    
}
