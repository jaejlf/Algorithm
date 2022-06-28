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

/*
Deque<Integer> dq = new LinkedList<>(); // 큐 선언
dq.add(1);                              // 맨 앞에 값 추가 -> 성공 시 T, 실패 시 예외 발생
dq.addFirst(0);                         // 맨 앞에 값 추가 -> 성공 시 T, 실패 시 예외 발생
dq.addLast(100);                        // 맨 뒤에 값 추가 -> 성공 시 T, 실패 시 예외 발생
dq.offer(2);                            // 맨 앞에 값 추가 -> 성공 시 T, 실패 시 F 발생
dq.offerFirst(2);                       // 맨 앞에 값 추가 -> 성공 시 T, 실패 시 F 발생
dq.offerLast(2);                        // 맨 뒤에 값 추가 -> 성공 시 T, 실패 시 F 발생
dq.remove();                            // 맨 앞에 값 제거 -> 리턴 후 제거, 비어있다면 예외 발생
dq.removeFirst();                       // 맨 앞에 값 제거 -> 리턴 후 제거, 비어있다면 예외 발생
dq.removeLast();                        // 맨 뒤에 값 제거 -> 리턴 후 제거, 비어있다면 예외 발생
dq.poll();                              // 맨 앞에 값 제거 -> 리턴 후 제거, 비어있다면 null 리턴
dq.pollFirst();                         // 맨 앞에 값 제거 -> 리턴 후 제거, 비어있다면 null 리턴
dq.pollLast();                          // 맨 뒤에 값 제거 -> 리턴 후 제거, 비어있다면 null 리턴
dq.getFirst();                          // 맨 앞의 값 리턴 -> 비어있다면 예외 발생
dq.getLast();                           // 맨 뒤의 값 리턴 -> 비어있다면 예외 발생
dq.peek();                              // 맨 앞의 값 리턴 -> 비어있다면 null 리턴
dq.peekFirst();                         // 맨 앞의 값 리턴 -> 비어있다면 null 리턴
dq.peekLast();                          // 맨 뒤의 값 리턴 -> 비어있다면 null 리턴
dq.removeFirstOccurrence(x);            // 맨 앞에서부터 탐색하여, x와 동일한 첫 원소 제거
dq.removeLastOccurrence(x);             // 맨 뒤에서부터 탐색하여, x와 동일한 첫 원소 제거
dq.element();                           // 첫 번째 값 리턴 -> 비어있다면 예외 발생
dq.push(2);                             // 맨 앞에 값 추가 -> 실패 시 예외 발생
dq.pop();                               // 맨 앞에 값 제거 -> 리턴 후 제거, 비어있다면 예외 발생
dq.remove(x);                           // removeFirstOccurrence와 동일
pq.size();                              // 덱의 크기 출력
pq.isEmpty();                           // 덱이 비어있는지 체크 -> T/F 반환
pq.contains(1);                         // 덱에 특정 요소가 있는지 체크 -> T/F 반환
*/

public class pq_dq {
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

        Deque<Integer> dq = new LinkedList<>();

        dq.add(2);
        dq.add(1);
        dq.offer(3);
        dq.addFirst(100);
        dq.addLast(300);

        System.out.println(dq); // [100, 2, 1, 3, 300]

        dq.removeFirst();
        dq.pollLast();
        dq.push(2);
        System.out.println(dq); // [2, 2, 1, 3]

        dq.removeFirstOccurrence(2);
        System.out.println(dq); // [2, 1, 3]

    }
}
