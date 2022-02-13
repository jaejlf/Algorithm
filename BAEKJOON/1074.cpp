// Z
#include <math.h>
#include <iostream>

using namespace std;

int N, r, c;
int result;

void Z(int row, int col, int size) {
    if (row == r && col == c) {
        cout << result << endl;
        return;
    }

    if (r < row + size && r >= row && c < col + size && c >= col) {  //현재 4분면 내에 존재
        Z(row, col, size / 2);                                     // 1사분면
        Z(row, col + size / 2, size / 2);                          // 2사분면
        Z(row + size / 2, col, size / 2);                          // 3사분면
        Z(row + size / 2, col + size / 2, size / 2);               // 4사분면

    } else {  //현재 4분면 내에 존재하지 않음
        result += size * size;
    }
}

int main() {
    cin >> N >> r >> c;
    cin.clear();

    Z(0, 0, pow(2, N));
}