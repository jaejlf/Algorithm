//비밀지도
#include <string>
#include <vector>

using namespace std;

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer;
    int* resultArr = new int[n];
    string decode;

    for(int i = 0; i < n; i++){
        resultArr[i] = arr1[i] | arr2[i];

        decode = "";
        for(int j = 0; j < n; j++){    
            if(resultArr[i] % 2 == 0) decode = " " + decode;
            else decode = "#" + decode;
            resultArr[i] = resultArr[i] >> 1;
        }
        answer.push_back(decode);
    }

    return answer;
}