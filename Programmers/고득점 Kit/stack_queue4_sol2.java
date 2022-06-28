// 주식 가격 - stack

import java.util.*;

class Solution {
    public int[] solution(int[] prices) {

        int[] answer = new int[prices.length];
        Stack<Integer> beginIndex = new Stack<>();

        int i = 0;
        beginIndex.push(i);

        for (i = 1; i < prices.length; i++) {
            while (!beginIndex.empty() && prices[i] < prices[beginIndex.peek()]) {
                int index = beginIndex.pop();
                answer[index] = i - index;
            }
            beginIndex.push(i);
        }

        while (!beginIndex.empty()) {
            int index = beginIndex.pop();
            answer[index] = i - index - 1;
        }

        return answer;
        
    }
}