class Solution {
public:
    int removeCoveredIntervals(vector<vector<int>>& in) {
        sort(in.begin(),in.end(),[](vector<int>&a ,vector<int>&b){
            if(a[0]==b[0]){
                return a[1] >b[1]; // large ele jo hain vah
            }
            return a[0] < b[0];// jo cohta hain vah aaye ga 

        });
         int end=in[0][1]; int n=in.size();
        int count=0;
         for(int i =1;i<n ; i++){
              if(in[i][1]<=end){
                count++;
              }else{
               end=in[i][1];
              }
         }
         return n-count;
    }
};