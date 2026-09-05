class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        

        // nums1 aur nums2 ko  ak main karna hain but how 
        // nums2 ka ele check karo ke fi\
        // simple nums1 ko copy kar lu then slove kar du 
        int []copy=new int[m];
        for(int i =0 ; i< m ; i++){
            copy[i]=nums1[i];
        }
    int i =0 ; int j=0;
    int k=0;
        while(i<m && j< n){
            // jo chota rahe ga wahi push karu ga 
            if(copy[i]<=nums2[j]){
                nums1[k]=copy[i];

                i++;
            }else{
                nums1[k]=nums2[j];
                j++;
            }
            k++;
        }

        //
        while(i< m){
            nums1[k]=copy[i];
            i++;
            k++;
        }
        while(j<n ){
            nums1[k]=nums2[j];
            j++;
            k++;
        }
    }
}