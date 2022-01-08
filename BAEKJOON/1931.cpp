//회의실 배정
#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

struct MeetingTime {
    int start;
    int finish;
};

bool compare(const MeetingTime &m1, const MeetingTime &m2) {
    if (m1.start == m2.start) {        //시작 시간이 같다면
        return m1.finish < m2.finish;  //더 일찍 끝나는 순
    } else {
        return m1.start < m2.start;  //시작 시간 순
    }
}

void findMaxMetting(vector<MeetingTime> meet, int num) {
    sort(meet.begin(), meet.end(), compare);

    int meetingNum = 1;               //회의는 최소 1번
    int finishTime = meet[0].finish;  //앞 회의의 종료 시간

    for (int i = 1; i < num; i++) {
        if (finishTime <= meet[i].start) {
            meetingNum++;
            finishTime = meet[i].finish;
        } else if (finishTime > meet[i].finish) { //종료 시간이 더 빠른 회의가 있다면 변경
            finishTime = meet[i].finish;
        }
    }

    cout << meetingNum << endl;
}

int main() {
    int num;
    cin >> num;
    cin.clear();

    vector<MeetingTime> meet(num);
    for (int i = 0; i < num; i++) {
        cin >> meet[i].start;
        cin >> meet[i].finish;
    }

    findMaxMetting(meet, num);
}