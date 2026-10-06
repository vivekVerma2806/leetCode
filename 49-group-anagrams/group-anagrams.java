class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // mujhe kya arkan hain  dekhna hain  ke parsent hain  ke nhi 
        // ak Hashmap banvo string ko sort karo aut ush  ko key ke tarh use karo
        // then  ush key main  tum idx ke value put on karo jaha jaha match huva hain 
        // then for 

        HashMap<String,List<String>>mp=new HashMap<>(); int n = strs.length;

        for(int i=0 ; i< n ; i++){
            char [] ch= strs[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!mp.containsKey(key)){
                mp.put(key,new ArrayList<>());
            }
            mp.get(key).add(strs[i]);
        }
    
         List<List<String>> ans=new ArrayList<>();
         for(Map.Entry<String,List<String>> e : mp.entrySet()){
             List<String>val=e.getValue();
             ans.add(val);
         }
          return ans;
    }
}