// ABCDE
#include <cstring>
#include <iostream>
#include <vector>

#define MAX 2000
#define EXIST 1
#define NOT_EXIST 0
#define VISITED 1
#define NOT_VISITED 0

using namespace std;

int N, M, answer;
vector<int> friends[MAX];
int visited[MAX] = {};

void inputFriends() {
    for (int i = 0; i < M; i++) {
        int a, b;
        cin >> a >> b;

        friends[a].push_back(b);
        friends[b].push_back(a);
    }
}

void DFS(int index, int count) {
    if (count == 5) {
        answer = EXIST;
        return;
    }

    visited[index] = VISITED;
    for (int i = 0; i < friends[index].size(); i++) {
        int next = friends[index][i];
        if (visited[next] == VISITED) continue;
        DFS(next, count + 1);
        if (answer == EXIST) return;
    }
    visited[index] = NOT_VISITED;
}

int main() {
    cin >> N >> M;
    cin.clear();

    inputFriends();

    answer = NOT_EXIST;
    for (int i = 0; i < N; i++) {
        memset(visited, NOT_VISITED, sizeof(visited));
        DFS(i, 1);
        if (answer == EXIST) break;
    }

    cout << answer << endl;
}