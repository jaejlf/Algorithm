//꽃길
#include <iostream>

#define NOT_VISTED 0
#define VISITED 1

using namespace std;

int N;         //화단의 한 변의 길이
int minPrice = 987654321;  //최소 비용
int sqPrice[10][10];
int visited[10][10];

bool check(int i, int j){
    if(visited[i][j] == VISITED) return false;
    if(visited[i + 1][j] == VISITED) return false;
    if(visited[i][j + 1] == VISITED) return false;
    if(visited[i - 1][j] == VISITED) return false;
    if(visited[i][j - 1] == VISITED) return false;
    return true;
}

void reset_VISITED(int i, int j){
    visited[i][j] = VISITED;
    visited[i + 1][j] = VISITED;
    visited[i][j + 1] = VISITED;
    visited[i - 1][j] = VISITED;
    visited[i][j - 1] = VISITED;
}

void reset_NOT_VISITED(int i, int j) {
    visited[i][j] = NOT_VISTED;
    visited[i + 1][j] = NOT_VISTED;
    visited[i][j + 1] = NOT_VISTED;
    visited[i - 1][j] = NOT_VISTED;
    visited[i][j - 1] = NOT_VISTED;
}

void dfs(int count) {

    //3개 다 심었을 경우
    if(count == 3){
        int sum = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(visited[i][j] == VISITED){
                    sum += sqPrice[i][j];
                }
            }
        }
        if(minPrice > sum) minPrice = sum; //최소 비용으로 갱신
        return;
    }

    for (int i = 1; i < N - 1; i++) {
        for (int j = 1; j < N - 1; j++) {
            if (!check(i, j)) continue;
            reset_VISITED(i, j);
            dfs(count + 1);
            reset_NOT_VISITED(i, j);
        }
    }
}

int main() {
    cin >> N;
    cin.clear();

    //평당 가격 저장
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            cin >> sqPrice[i][j];
        }
    }

    dfs(0);

    cout << minPrice << endl;
}