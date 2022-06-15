//STL을 활용한 큐 구현
#include <iostream>
#include <queue>

using namespace std;

int main() {
    queue<int> q;
    q.push(1);
    q.push(2);
    q.push(3);

    cout << "size : " << q.size() << endl;  //큐의 사이즈 반환

    cout << q.front() << endl;
    q.pop();

    cout << q.front() << endl;
    q.pop();

    cout << q.front() << endl;
    q.pop();

    cout << "empty? " << q.empty() << endl;  //큐가 비었는지 bool값 반환

    return 0;
}