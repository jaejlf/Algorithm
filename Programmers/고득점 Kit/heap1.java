// 더 맵게

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int scov : scoville) {
            pq.add(scov);
        }

        int answer = 0;
        while (pq.peek() < K) {

            if (pq.size() <= 1)
                return -1;

            int food1 = pq.remove();
            int food2 = pq.remove();

            pq.add(food1 + (food2 * 2));
            answer++;
        }

        return answer;

    }
}