//Z
#include <math.h>

#include <iostream>

using namespace std;

int N, r, c;
int result;

void Z(int y, int x, int size) {
    if (y == r && x == c) {
        cout << result << endl;
        return;
    }

    if (r < y + size && r >= y && c < x + size && c >= x) {
        Z(y, x, size / 2);                        // 1사분면
        Z(y, x + size / 2, size / 2);             // 2사분면
        Z(y + size / 2, x, size / 2);             // 3사분면
        Z(y + size / 2, x + size / 2, size / 2);  // 4사분면

    } else {
        result += size * size;
    }
}

int main() {
    cin >> N >> r >> c;
    cin.clear();

    Z(0, 0, pow(2, N));
}