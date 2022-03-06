//빗물
#include <bits/stdc++.h>
#define MAX 500

using namespace std;

int H, W, answer = 0;
int height[MAX];

void findRainDrop() {
    int rain;
    for (int i = 2; i < W; i++) {
        int leftmax = 0, rightmax = 0;

        //왼쪽 최대 높이
        for (int j = 1; j < i; j++) {
            leftmax = max(leftmax, height[j]);
        }
        //오른쪽 최대 높이
        for (int j = i + 1; j <= W; j++) {
            rightmax = max(rightmax, height[j]);
        }

        rain = min(leftmax, rightmax) - height[i];
        if (rain >= 0) {
            answer += rain;
        }
    }

    cout << answer << endl;
}

int main() {
    cin >> H >> W;
    cin.clear();

    int h;
    for (int i = 1; i <= W; i++) {
        cin >> height[i];
    }

    findRainDrop();
}