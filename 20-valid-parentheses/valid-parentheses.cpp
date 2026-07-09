class Solution {
public:
    bool isValid(string s) {
        stack<int>st;
        for(char ch : s){
            if(ch=='{' ||ch=='[' || ch=='('){
                st.push(ch);
            }else{
                if(st.empty()){
                    return false;
                }
                char c=st.top();
                
                if(c=='{'){
                    if(ch!='}'){
                        return false;
                    }else{
                        st.pop();
                    }
                }
                else if(c=='('){
                    if(ch!=')'){
                        return false;
                    }else{
                        st.pop();
                    }

                }else{
                    if(ch!=']'){
                        return false;
                    }else{
                        st.pop();
                    }
                }
            }
        }
        return st.empty();
    }
};