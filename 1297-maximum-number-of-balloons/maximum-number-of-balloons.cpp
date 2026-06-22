class Solution {
public:
    int maxNumberOfBalloons(string text) {

        vector<int> feq(26,0);

        for(char ch : text){
            feq[ch-'a']++;
        }

        return min({
            feq['b'-'a'],
            feq['a'-'a'],
            feq['l'-'a']/2,
            feq['o'-'a']/2,
            feq['n'-'a']
        });
    }
};