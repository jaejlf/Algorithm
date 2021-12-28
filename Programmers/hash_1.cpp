//완주하지 못한 선수
#include <string>
#include <vector>

using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    string answer = "";

    for (int i = 0; i < participant.size(); i++) {
        for (int j = 0; j < completion.size(); j++) {
            if (participant[i] == completion[j]) {
                participant.erase(participant.begin() + i);
                completion.erase(completion.begin() + j);
                i--;
                break;
            }
        }
    }

    if (!participant.empty()) {
        answer = participant.front();
    }

    return answer;
}