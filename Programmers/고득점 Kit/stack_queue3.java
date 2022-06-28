// 다리를 지나는 트럭

import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        Queue<Integer> bridgeQ = new LinkedList<>();
        Queue<Integer> waitQ = new LinkedList<>();

        int answer = 0;
        int totalWeight = 0;
        int truckCount = 0;

        for (int i = 0; i < bridge_length; i++) {
            bridgeQ.add(0);
        }

        for (int i = 0; i < truck_weights.length; i++) {
            waitQ.add(truck_weights[i]);
        }

        while (!waitQ.isEmpty()) {
            if (bridgeQ.peek() != 0) {
                truckCount--;
                totalWeight -= bridgeQ.peek();
            }
            bridgeQ.remove();
            answer++;

            if ((totalWeight + waitQ.peek() <= weight) && (truckCount < bridge_length)) {
                truckCount++;
                totalWeight += waitQ.peek();
                bridgeQ.add(waitQ.remove());

            } else {
                bridgeQ.add(0);
            }
        }

        while (!bridgeQ.isEmpty()) {
            bridgeQ.remove();
            answer++;
        }

        return answer;

    }
}