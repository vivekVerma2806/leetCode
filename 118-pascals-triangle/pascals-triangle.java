class Solution {
    public List<List<Integer>> generate(int n) {
        
        List<List<Integer>>Pascal=new ArrayList<>();
        for(int i =0 ; i< n ; i++){
            Pascal.add(new ArrayList<>());
        }
        // ab pascal[0]
        Pascal.get(0).add(1);

        for(int i=1  ;i < n ; i++){
            //col main hain 
            for(int j=0; j<=i ; j++){
              // o col aur last ke liye 
              if(j==0 || j==i) {Pascal.get(i).add(1);}else{
              
              int val=Pascal.get(i-1).get(j-1)+Pascal.get(i-1).get(j);
              Pascal.get(i).add(val);
              }
            }
        }

        return Pascal;
    }
}