// 타일 채우기

#include <bits/stdc++.h>
#define MAX 31

using namespace std;

int N;
int dp[MAX];

int main() {
    cin >> N;
    cin.clear();

    dp[0] = 1;
    dp[1] = 0;
    dp[2] = 3;

    if (N % 2 == 0) {
        for (int i = 4; i <= N; i += 2) {
            dp[i] = dp[i - 2] * 3;

            for (int j = 4; i - j >= 0; j += 2) {
                dp[i] += dp[i - j] * 2;
            }
        }
    }

    cout << dp[N];
}