// 기능 개발

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
            q.add(day);
        }

        ArrayList<Integer> deployCount = new ArrayList<>();

        int count = 1;
        int peek = q.remove();
        while (!q.isEmpty()) {
            if (q.peek() <= peek) {
                count++;
            } else {
                deployCount.add(count);
                count = 1;
                peek = q.peek();
            }
            q.poll();
        }
        deployCount.add(count);

        int[] answer = new int[deployCount.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = deployCount.get(i);
        }

        return answer;

    }
}