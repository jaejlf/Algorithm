// 마법사 상어와 토네이도

#include <bits/stdc++.h>

#define MAX 500
#define WEST 0
#define SOUTH 1
#define EAST 2
#define NORTH 3

using namespace std;

int N;
int answer = 0;
int Map[MAX][MAX];

double percent[5][5] = {
    {0, 0, 0.02, 0, 0},
    {0, 0.1, 0.07, 0.01, 0},
    {0.05, 1.0, 0, 0, 0},
    {0, 0.1, 0.07, 0.01, 0},
    {0, 0, 0.02, 0, 0}};

int dir[4][2] = {
    {0, -1},  // ←
    {1, 0},   // ↓
    {0, 1},   // →
    {-1, 0}   // ↑
};

bool checkRange(int r, int c) {
    if((r >= 0 && r < N) && (c >= 0 && c < N)){
        return true;
    }
    else{
        return false;
    }
}

void spread(int r, int c) {
    int amount = Map[r][c];
    Map[r][c] = 0;

    for (int i = -2; i <= 2; i++) {
        for (int j = -2; j <= 2; j++) {
            double per = percent[i + 2][j + 2];

            if (per == 0) continue;

            int leftSand;

            if (per == 1.0) {
                leftSand = amount - floor(amount * 0.02) * 2
                              - floor(amount * 0.1)  * 2
                              - floor(amount * 0.07) * 2
                              - floor(amount * 0.01) * 2
                              - floor(amount * 0.05);
            } else {
                leftSand = floor(amount * per);
            }

            int nextR = r + i;
            int nextC = c + j;

            if(checkRange(nextR, nextC)){
                Map[nextR][nextC] += leftSand;
            }
            else{
                answer += leftSand;
            }
        }
    }
}

void change_percent_dir() {
    double tmp[5][5];

    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            tmp[4 - j][i] = percent[i][j];
        }
    }

    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            percent[i][j] = tmp[i][j];
        }
    }
}

int chage_dir(int d) {
    if (d == NORTH) return WEST;
    if (d == WEST) return SOUTH;
    if (d == SOUTH) return EAST;
    if (d == EAST) return NORTH;
}

void moveTornado() {
    int r = N / 2;
    int c = N / 2;
    int cnt = 1;
    int d = WEST;

    while (true) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < cnt; j++) {
                r = r + dir[d][0];
                c = c + dir[d][1];

                spread(r, c);

                if (r == 0 && c == 0) return;
            }
            d = chage_dir(d);

            change_percent_dir();
        }

        cnt++;
    }
}

int main(void) {
    cin >> N;

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            cin >> Map[i][j];
        }
    }

    moveTornado();
    cout << answer << endl;
}