class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int freq[]=new int[26];

        for(int i =0;i<s1.length();i++){
            char ch=s1.charAt(i);
            freq[ch-'a']++;
        }

       
        int windowsize=s1.length();
     

        for(int i=0;i<s2.length();i++){

            int winFreq[]= new int[26];
            int l=0;
            int r=i;
            while(l<windowsize && r<s2.length()){

                winFreq[s2.charAt(r)-'a']++;

                l++;r++;

            }

            if(freqIsSame(freq,winFreq)){
                return true;
            }


        }
        return false;
        
    }

    static boolean freqIsSame(int freq[],int b[]){
        for(int i=0;i<b.length;i++){
            if(freq[i]!=b[i]){
                return false;
            }
            
        }
        return true;
    }
}