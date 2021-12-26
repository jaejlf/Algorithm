//A와 B 2
#include <bits/stdc++.h>
#define TRUE 1
#define FALSE 0
using namespace std;
 
string popA(string s) {
    s.pop_back();
    return s;
}
 
string rev(string s) {
    reverse(s.begin(), s.end());
    s.pop_back();
    return s;
}

int compare(string s, string t) {
    if (s.size() == t.size()) {
        if (s == t) return TRUE;
        else return FALSE;
    }
    if (t.size() >= 1) {
        if (t.front() == 'A' && t.back() == 'A')
            return compare(s, popA(t));
 
        if (t.front() == 'A' && t.back() == 'B')
            return FALSE;
 
        if (t.front() == 'B' && t.back() == 'A') {
            return compare(s, popA(t)) || compare(s, rev(t));
        }
 
        if (t.front() == 'B' && t.back() == 'B') {
            return compare(s, rev(t));
        }
    }
}
 
int main() {
    string s, t;
    cin >> s >> t;
    if(compare(s,t)){
      cout << TRUE;
    }
    else{
      cout << FALSE;
    }  
}