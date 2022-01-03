//달나라 토끼를 위한 구매대금 지불 도우미
#include <algorithm>
#include <iostream>

using namespace std;

void findCoinsNum(int money) {
    int cases[100001] = {0, 1, 1, 2, 2, 1, 2, 1};

    for (int i = 8; i <= money; i++) {
        if (i % 7 == 0) {
            cases[i] = i / 7;
        } else {
            cases[i] = min({cases[i - 7], cases[i - 5], cases[i - 2], cases[i - 1]}) + 1;
        }
    }

    cout << cases[money] << endl;
}

int main() {
    int money;
    cin >> money;

    findCoinsNum(money);
}