class MyStack {
public:
    queue<int> st;

    MyStack() {

    }

    void push(int x) {
        st.push(x);

        int sz = st.size();

        while (sz > 1) {
            st.push(st.front());
            st.pop();
            sz--;
        }
    }

    int pop() {
        int x = st.front();
        st.pop();
        return x;
    }

    int top() {
        return st.front();
    }

    bool empty() {
        return st.empty();
    }
};