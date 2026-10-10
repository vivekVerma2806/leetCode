class Solution {
    public int[][] merge(int[][] intervals) {

        int n=intervals.length; if(n==1) return intervals;

         Arrays.sort(intervals,(a,b)->{
            return Integer.compare(a[0],b[0]);
         });

         int st_p=intervals[0][0]; int end_p=intervals[0][1];
         List<List<Integer>>val=new ArrayList<>();
         for(int i=1 ;i < n ;i++){
               if(end_p>=intervals[i][0]){
                   end_p=Math.max(end_p,intervals[i][1]);
               }else{
                   List<Integer>curr=new ArrayList<>();
                   curr.add(st_p);
                   curr.add(end_p);
                   val.add(curr);
                   st_p=intervals[i][0];end_p=intervals[i][1];
               }
         }
         
                 List<Integer>curr=new ArrayList<>();
                   curr.add(st_p);
                   curr.add(end_p);
                   val.add(curr);
                   int m=val.size();
          int [][] ans=new int [m][2];    
          for(int i=0  ;i <m ;i++){
                ans[i][0]=val.get(i).get(0);
                ans[i][1]=val.get(i).get(1);
          }  
          return ans;   
    }
}