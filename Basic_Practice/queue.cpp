//STL�� Ȱ���� ť ����
#include <iostream>
#include <queue>

using namespace std;

int main() {
    queue<int> q;
    q.push(1);
    q.push(2);
    q.push(3);

    cout << "size : " << q.size() << endl;  //ť�� ������ ��ȯ

    cout << q.front() << endl;
    q.pop();

    cout << q.front() << endl;
    q.pop();

    cout << q.front() << endl;
    q.pop();

    cout << "empty? " << q.empty() << endl;  //ť�� ������� bool�� ��ȯ

    return 0;
}