import java.io.*;
import java.util.*;

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
