class MedianFinder {
public:
    priority_queue<int> left_maxheap;

    priority_queue<int, vector<int>, greater<int>> right_minheap;

    MedianFinder() {}

    void addNum(int num) {

        left_maxheap.push(num);

        right_minheap.push(left_maxheap.top());
        left_maxheap.pop();

        if (right_minheap.size() > left_maxheap.size()) {
            left_maxheap.push(right_minheap.top());
            right_minheap.pop();
        }
    }

    double findMedian() {

        if (left_maxheap.size() == right_minheap.size()) {
            return (left_maxheap.top() + right_minheap.top()) / 2.0;
        }

        return left_maxheap.top();
    }
};