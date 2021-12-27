//STL을 활용한 스택 구현
#include <iostream>
#include <stack>

using namespace std;

int main() {
    stack<int> s;
    s.push(1);
    s.push(2);
    s.push(3);

    cout << "size : " << s.size() << endl;  //스택의 사이즈 반환

    cout << s.top() << endl;
    s.pop();

    cout << s.top() << endl;
    s.pop();

    cout << s.top() << endl;
    s.pop();

    cout << "empty? " << s.empty() << endl;  //스택이 비었는지 bool값 반환

    return 0;
}