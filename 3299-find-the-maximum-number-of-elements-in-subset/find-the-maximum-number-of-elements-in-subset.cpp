#define ll long long

class Solution {
public:
    int maximumLength(vector<int>& nums) {

        map<ll, int> feq;
        int one = 0;

        for (int x : nums) {
            if (x == 1)
                one++;
            else
                feq[x]++;
        }

        if (one % 2 == 0 && one > 0)
            one--;

        int ans = one;

        for (auto it : feq) {

            ll value = it.first;          // long long
            ll base = sqrtl(value);

            if (base * base == value &&
                feq.count(base) &&
                feq[base] >= 2)
                continue;

            int count = 0;

            while (feq.count(value) && feq[value] > 1) {

                count += 2;

                // Prevent overflow
                // if (value > 1000000000LL)
                //     break;

                value = value * value;
            }

            if (feq.count(value) && feq[value] == 1)
                count++;
            else
                count--;

            ans = max(ans, count);
        }

        return ans;
    }
};