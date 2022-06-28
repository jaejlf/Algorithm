import java.util.*;

/*
PriorityQueue<Integer> pq = new PriorityQueue<>(); // 우선순위가 낮은 것 - 오름차순
PriorityQueue<Integer> pq_rev = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위가 높은 것 - 내림차순

pq.add(1);                              // 값 추가 -> 성공 시 T, 실패 시 예외 발생
pq.offer(2);                            // 값 추가 -> 성공 시 T, 실패 시 F 발생
pq.remove();                            // 값 제거 -> 리턴 후 제거, 비어있다면 예외 발생
pq.poll();                              // 값 제거 -> 리턴 후 제거, 비어있다면 null 리턴
pq.clear();                             // 전체 값 제거 (큐 초기화)
pq.element();                           // 첫 번째 값 리턴 -> 비어있다면 예외 발생
pq.peek();                              // 첫 번째 값 리턴 -> 비어있다면 null 리턴
pq.size();                              // 큐의 크기 출력
pq.isEmpty();                           // 큐가 비어있는지 체크 -> T/F 반환
pq.contains(1);                         // 큐에 특정 요소가 있는지 체크 -> T/F 반환
*/

public class priority_queue {
    public static void main(String[] args) {

        // 우선순위가 낮은 것 - 오름차순
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 우선순위가 높은 것 - 내림차순
        PriorityQueue<Integer> pq_rev = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(2);
        pq.add(1);
        pq.offer(3);

        System.out.println(pq); // [1, 2, 3]

        pq_rev.add(2);
        pq_rev.add(1);
        pq_rev.offer(3);

        System.out.println(pq_rev); // [3, 1, 2]

    }
}
