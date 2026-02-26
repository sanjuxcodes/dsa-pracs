import java.util.*;

 class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();   // number of test cases

        while(T-- > 0) {

            int N = sc.nextInt();   // number of exercises
            int E = sc.nextInt();   // initial energy

            int[] arr = new int[N];

            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int result = solve(N, E, arr);

            System.out.println(result);
        }

        sc.close();
    }
    static void  swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int[] sortt(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int maxidx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[maxidx]){
                    maxidx=j;
                }

            }
            swap(arr,maxidx,i);
        }
        return arr;
    }
    // 🔹 Write your greedy logic here
    public static int solve(int N, int E, int[] arr) {

        Arrays.sort(arr);

        int count =0;

        if(arr[N-1]>=E){
            return 1;
        }
        for(int i=N-1;i>=0 && E>0 ;i--){


        int use=2;
        
            while(use>0 && E>0){
                E-=arr[i];
                count++;
                use--;


            }
        }
        if(E>0)
            return -1;
        else
            return count;

 
    }
}