class Solution {
    public long findKthSmallest(int[] coins, int k) {

        // C++: long long low = 1;
        // Java: long = C++ ke long long jaisa use hota hai
        long low = 1;

        // C++: long long high = 0;
        // Java: long high
        long high = 0;

        // C++: for(int coin : coins)
        // Java mein bhi same enhanced for loop hota hai
        for (int coin : coins) {

            // C++: high = max(high, 1LL * coin * k);
            // Java: Math.max() -> C++ ke max() jaisa
            high = Math.max(high, (long) coin * k);
        }

        // Binary Search
        // C++:
        // while(low < high)
        // Java mein bhi same
        while (low < high) {

            // C++:
            // long long mid = low + (high - low) / 2;
            //
            // Java:
            // long mid = ...
            long mid = low + (high - low) / 2;

            // mid tak kitne valid amounts hain?
            //
            // C++ mein:
            // if(count(mid, coins) >= k)
            //
            // Java mein bhi same
            if (count(mid, coins) >= k) {

                // C++: high = mid;
                high = mid;

            } else {

                // C++: low = mid + 1;
                low = mid + 1;
            }
        }

        // C++: return low;
        // Java: return low;
        return low;
    }


    // Ye function batata hai:
    // x tak kitne valid amounts ban sakte hain
    private long count(long x, int[] coins) {

        // C++: long long ans = 0;
        long ans = 0;

        // C++: int n = coins.size();
        // Java array ke liye .length
        int n = coins.length;


        // Saare subsets check karenge
        //
        // C++:
        // for(int mask = 1; mask < (1 << n); mask++)
        //
        // Java mein bhi same
        for (int mask = 1; mask < (1 << n); mask++) {

            // LCM calculate karne ke liye
            //
            // C++: long long lcm = 1;
            long lcm = 1;

            // Kitne coins current subset mein hain
            int bits = 0;

            // Agar LCM x se bada ho gaya,
            // to is subset ko ignore kar sakte hain
            boolean valid = true;


            // Har coin ko check karenge
            //
            // C++:
            // for(int i = 0; i < n; i++)
            //
            // Java:
            // exactly same
            for (int i = 0; i < n; i++) {

                // Check:
                // kya current coin subset mein hai?
                //
                // C++:
                // if(mask & (1 << i))
                //
                // Java:
                // same bitwise operation
                if ((mask & (1 << i)) != 0) {

                    bits++;


                    // Current coin ko LCM mein include karo
                    //
                    // C++:
                    // lcm = lcm(lcm, coins[i]);
                    //
                    // Java:
                    // apna banaya hua lcm() function
                    lcm = lcm(lcm, coins[i]);


                    // Agar LCM x se bada hai,
                    // to x tak iska koi multiple nahi hoga
                    if (lcm > x) {
                        valid = false;
                        break;
                    }
                }
            }


            // Invalid subset ko skip karo
            //
            // C++:
            // if(!valid) continue;
            //
            // Java:
            // same
            if (!valid)
                continue;


            // x tak LCM ke kitne multiples hain?
            //
            // Example:
            // x = 20
            // lcm = 5
            //
            // 5,10,15,20
            // => 20/5 = 4
            long multiples = x / lcm;


            // Inclusion-Exclusion:
            //
            // Odd number of coins:
            // ADD
            //
            // Even number of coins:
            // SUBTRACT
            if (bits % 2 == 1)
                ans += multiples;
            else
                ans -= multiples;
        }


        // Total valid amounts
        return ans;
    }


    // GCD = Greatest Common Divisor
    //
    // C++:
    // long long gcd(long long a, long long b)
    //
    // Java:
    // long gcd(long a, long b)
    private long gcd(long a, long b) {

        // Euclidean Algorithm
        while (b != 0) {

            long temp = a % b;

            a = b;
            b = temp;
        }

        return a;
    }


    // LCM = Least Common Multiple
    //
    // Formula:
    // LCM(a,b) = a / GCD(a,b) * b
    //
    // C++:
    // long long lcm(long long a, long long b)
    //
    // Java:
    // long lcm(long a, long b)
    private long lcm(long a, long b) {

        return a / gcd(a, b) * b;
    }
}