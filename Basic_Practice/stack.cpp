//STL�� Ȱ���� ���� ����
#include <iostream>
#include <stack>

using namespace std;

int main() {
    stack<int> s;
    s.push(1);
    s.push(2);
    s.push(3);

    cout << "size : " << s.size() << endl;  //������ ������ ��ȯ

    cout << s.top() << endl;
    s.pop();

    cout << s.top() << endl;
    s.pop();

    cout << s.top() << endl;
    s.pop();

    cout << "empty? " << s.empty() << endl;  //������ ������� bool�� ��ȯ

    return 0;
}