class Solution {
public:
    
    int solve(vector<int>&nums,int st ,int end,int target){
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return -1;
    }


    int search(vector<int>& nums, int target) {

        // frist of all hame find out karna hain vah idx jaha se roted hain

        int n =nums.size();
        if(nums[0]<=nums[n-1]){
            //ye sorted hain
            return solve(nums,0,n-1,target);
        }
       int st=0; int end=n-1;
      while(st<end){
        int mid=st+(end-st)/2;
        if(nums[st]<nums[mid]){
            // ye sorted hain
            st=mid;
        }else{
            end=mid;
        }
      }
     
     int st1=0; int end1=st; int st2=st+1; int  end2 =n-1;

     int ans1=solve(nums,st1,end1,target) ;
     int ans2 =solve(nums,st2,end2,target);

     if(ans1==-1 && ans2==-1){
        return -1;
     }
        
     if(ans1!=-1){
        return ans1;
     }else{
        return ans2;
     }
return -1;
    }
};