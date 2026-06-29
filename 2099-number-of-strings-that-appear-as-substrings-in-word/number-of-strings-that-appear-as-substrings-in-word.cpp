class Solution {
public:

    int numOfStrings(vector<string>& patterns, string word) {
        int count=0;
        for(auto it  : patterns){
            // check karna hain it presnt hain ke nhi
            if(word.find(it)!=string :: npos){
                count++;
            }
        }
        return count;
    }
};