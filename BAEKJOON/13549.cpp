// 숨바꼭질 3
#include <bits/stdc++.h>
using namespace std;

#define VISITED 1
#define NOT_VISITED 0
#define MAX 100000

int visited[MAX + 1];
deque<pair<int, int>> dq;  // first : 위치, second : 비용

void findMinTime(int N, int K) {
    dq.push_front(make_pair(N, 0));
    visited[N] = VISITED;

    while (!dq.empty()) {
        pair<int, int> cur = dq.front();
        int curPos = cur.first;
        int curCost = cur.second;
        dq.pop_front();

        visited[curPos] = VISITED;

        // 목적지 찾음
        if (curPos == K) {
            cout << curCost << endl;
            return;
        }

        int goLeft = curPos - 1;
        int goRight = curPos + 1;
        int jump = curPos * 2;

        if (jump <= MAX && visited[jump] == NOT_VISITED) {
            dq.push_front(make_pair(jump, curCost));  //순간이동하면 push_front !
        }
        if (goLeft >= 0 && visited[goLeft] == NOT_VISITED) {
            dq.push_back(make_pair(goLeft, curCost + 1));
        }
        if (goRight <= MAX && visited[goRight] == NOT_VISITED) {
            dq.push_back(make_pair(goRight, curCost + 1));
        }
    }

    return;
}

int main() {
    int N, K;
    cin >> N >> K;
    cin.clear();

    memset(visited, NOT_VISITED, sizeof(visited));
    findMinTime(N, K);
}