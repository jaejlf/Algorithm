import java.util.*;

/*
Queue<Integer> queue= new LinkedList<>();  // 큐 선언
queue.add(1);                              // 값 추가 -> 성공 시 T, 실패 시 예외 발생
queue.offer(2);                            // 값 추가 -> 성공 시 T, 실패 시 F 발생
queue.clear();                             // 전체 값 제거 (큐 초기화)
queue.remove();                            // 값 제거 -> 리턴 후 제거, 비어있다면 예외 발생
queue.poll();                              // 값 제거 -> 리턴 후 제거, 비어있다면 null 리턴
queue.element();                           // 첫 번째 값 리턴 -> 비어있다면 예외 발생
queue.peek();                              // 첫 번째 값 리턴 -> 비어있다면 null 리턴
queue.size();                              // 큐의 크기 출력
queue.isEmpty();                           // 큐가 비어있는지 체크 -> T/F 반환
queue.contains(1);                         // 큐에 특정 요소가 있는지 체크 -> T/F 반환
*/

public class queue {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<String>();

        q.add("A");
        q.add("B");
        q.offer("c");
        q.offer("D");

        System.out.println(q.peek()); // 가장 상단의 값 출력
        System.out.println(q.remove());

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

    }
}
