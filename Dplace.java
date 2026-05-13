class Dplace{
    public static void main(String[] args) {

        int nums[]={1 ,2, 3, 4,5,6,7};

        int d=9;

       

        int n= nums.length;
        d=d%n;

        int temp[]= new int[d];

        for(int i=0;i<d;i++){
            temp[i]=nums[i];
        }

        int j=0;
        int l;


        for(l=d;l<n;l++){
            nums[j]=nums[l];
            j++;
        }
        int a=0;

        for(int i=j;i<n;i++){
            nums[i]=temp[a];
            a++;

        }

        for(int i : nums){
            System.out.println(i);
        }


        
    }

}
