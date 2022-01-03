//Moo 게임
#include <iostream>
using namespace std;

string s = "moo";

void moo(int n, int k, int len) {
    //k++;
    int mid_len = k + 3;
    int full_len = len * 2 + mid_len;

    if(n <= 3){
        cout << s[n - 1];
        return;
    }
    if(n > full_len){
        moo(n, k + 1, full_len);
    }
    else{
        if (n > len && n <= len + mid_len) {
            if (n == (len + 1)) {
                cout << "m" << endl;
            } else {
                cout << "o" << endl;
            }
            return;
        } else {
            moo(n - (len + mid_len), 1, 3);
        }
    }
}

int main() {
    int n;
    cin >> n;

    int k = 1;
    int full_len = 3;
    moo(n, k, full_len);
}