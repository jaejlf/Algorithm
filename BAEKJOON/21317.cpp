// 징검다리 건너기
#include <bits/stdc++.h>
using namespace std;

struct Energy {
    int small;
    int big;
};

int main() {
    int N;
    cin >> N;
    cin.clear();

    vector<Energy> energy(N);
    for (int i = 1; i < N; i++) {
        cin >> energy[i].small >> energy[i].big;
    }

    int K;
    cin >> K;

    unsigned int dp[N + 4][2];
    memset(dp, 255, sizeof(dp));

    dp[1][0] = 0;  //매우 큰 점프 X
    dp[1][1] = 0;  //매우 큰 점프 O

    for (int i = 1; i < N; i++) {

        for (int j = 0; j < 2; j++) {
            dp[i + 1][j] = min(dp[i + 1][j], dp[i][j] + energy[i].small);
            dp[i + 2][j] = min(dp[i + 2][j], dp[i][j] + energy[i].big);
        }
        dp[i + 3][1] = min(dp[i + 3][1], dp[i][0] + K);
    }

    cout << min(dp[N][0], dp[N][1]);
}