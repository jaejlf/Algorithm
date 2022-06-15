import java.util.*;

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
