// 매개변수 합 구하기

#include <iostream>
using namespace std;

int main(int argc, char *argv[])
{
  int sum = 0;

  for (int i = 0; i < argc - 1; i++)
  {
    sum += atoi(argv[i + 1]);
  }

  cout << sum << endl;

  return 0;
}