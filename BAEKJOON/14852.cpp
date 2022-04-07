// 타일 채우기 3

#include <bits/stdc++.h>

#define DIV 1000000007

using namespace std;

int N;
long long int dp[1000001][2];

int main() {
    cin >> N;
    cin.clear();

    dp[0][0] = 0;
    dp[1][0] = 2;
    dp[2][0] = 7;
    dp[2][1] = 1;

    for (int i = 3; i <= N; ++i) {
        dp[i][1] = (dp[i - 3][0] + dp[i - 1][1]) % DIV;
        dp[i][0] = (dp[i][1] * 2 + dp[i - 1][0] * 2 + dp[i - 2][0] * 3) % DIV;
    }

    cout << dp[N][0] << endl;
}