// 니가 싫어

#include <bits/stdc++.h>
using namespace std;

pair<int, int> arr[1000000];

int main() {
    int n;
    cin >> n;
    for (int i = 0; i < n; ++i) {
        cin >> arr[i].first >> arr[i].second;
    }

    sort(arr, arr + n);

    priority_queue<int> pq;
    int em = 0;
    int xm = 0;
    int answer = 0;

    for (int i = 0; i < n; i++) {
        pq.push(-arr[i].second);

        int prev = -1;
        while (arr[i].first >= -pq.top()) {
            prev = -pq.top();
            pq.pop();
        }

        if (pq.size() > answer) {
            em = arr[i].first;
            xm = -pq.top();
            answer = pq.size();
        } else if (pq.size() == answer && prev == arr[i].first) {
            xm = -pq.top();
        }
    }

    cout << answer << endl;
    cout << em << " " << xm;
}