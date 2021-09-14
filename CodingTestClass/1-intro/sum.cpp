//1 ~ N까지의 합 구하기

#include <iostream>
using namespace std;

int main()
{
  int num;
  int sum = 0;

  cin >> num;

  for (int i = 1; i <= num; i++)
  {
    sum += i;
  }

  cout << sum << endl;

  return 0;
}