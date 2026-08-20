
class Solution {
    public int[] resultArray(int[] nums) {
        
        //  nums of len n hain diya hain 
        // arr1 aur arr2 main dis karna hain  using n opreation o(n) 
        // nums 1 toarr a nums 2 arr2 
        // if lasy ele of arr1[lastidx]  >arr2[lastidx] nums[i] ke value arr1 main aaye ga otherwise arr2 mai   
        ArrayList<Integer>arr1= new ArrayList<>();
        ArrayList<Integer>arr2=new ArrayList<>();
        int n =nums.length;
        arr1.add(nums[0]); arr2.add(nums[1]);
        for(int i =2  ;i < n ;i++){
            int last1 = arr1.get(arr1.size()-1); int last2 = arr2.get(arr2.size()-1);
               if(last1>last2){
                    arr1.add(nums[i]);
               }else{
                arr2.add(nums[i]);
               }
        } 

        // ab dono arrayList ko merge karo
      int []ans=new int[n];
        for(int i =0 ; i< arr1.size() ; i++){
             ans[i]=arr1.get(i);
        }
        int j=arr1.size();
        for(int x  :  arr2){
            ans[j]=x;
            j++;
        }
        return ans;
    }
}