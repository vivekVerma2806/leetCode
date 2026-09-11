class Solution {
    public int totalNumbers(int[] digits) {
        // bruth force kaise kare ge 1  2 3 4 
         int []map=new int[10];
         for(int i =0 ; i< 10 ;i++){
            map[i]=0;
         }
         for(int num : digits){
             map[num]++;
         }
         HashSet<Integer> set=new HashSet<>();
         for(int i=1 ;i<=9 ;i++){
              if(map[i]==0) continue;
              else map[i]--;
            for(int j =0 ;j<=9 ;j++){
                if(map[j]==0) continue;
                map[j]--;
                for(int k=0 ; k<=9 ;k++){
                   if(map[k]==0) continue;
                    int val=i*100+j*10+k;
                    if((val&1)==0){
                        set.add(val);
                    }
                }
                map[j]++;
            }
            map[i]++;
         }
         return set.size();
    }
}