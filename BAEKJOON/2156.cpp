//포도주 시식
#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int wine[100001];
int dp[100001];

void findMaxWine(int num) {
    dp[1] = wine[1];
    for (int i = 2; i <= num; i++) {
        dp[i] = max({dp[i - 1], dp[i - 2] + wine[i], dp[i - 3] + wine[i] + wine[i - 1]});
    }
    cout << dp[num] << endl;
}

int main() {
    int num;
    cin >> num;
    cin.clear();

    wine[0] = 0;
    dp[0] = 0;

    for (int i = 1; i <= num; i++) {
        cin >> wine[i];
    }

    findMaxWine(num);
}