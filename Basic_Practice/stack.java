import java.util.*;

/*
Stack<Integer> stack = new Stack<>();  // 스택 선언
stack.push(1);                         // 값 추가
stack.pop();                           // 값 제거
stack.clear();                         // 전체 값 제거 (스택 초기화)
stack.peek();                          // 가장 상단의 값 출력
stack.size();                          // 스택의 크기 출력
stack.empty();                         // 스택이 비어있는지 체크 -> T/F 반환
stack.contains(1);                     // 스택에 특정 요소가 있는지 체크 -> T/F 반환
*/

public class stack {
    public static void main(String[] args) {

        Stack<String> s1 = new Stack<String>();

        s1.push("A");
        s1.push("B");
        s1.push("C");
        s1.push("D");

        System.out.println(s1.peek()); // 가장 상단의 값 출력

        while (!s1.empty()) {
            System.out.println(s1.pop());
        }

        Stack<String> s2 = new Stack<String>();

        s2.push("a");
        s2.push("b");
        s2.push("c");
        s2.push("d");
        s2.push("e");

        System.out.println(s2.size());
        System.out.println(s2.contains("e"));

        s2.clear();
        System.out.println(s2);

    }
}
