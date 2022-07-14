import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static int countPairs(List<Integer> numbers, int k) {

        Set<Integer> set = new HashSet<>(numbers);
        List<Integer> numList = new ArrayList<>(set);
        Collections.sort(numList);

        int cnt = 0;
        for (int i = 0; i < numList.size(); i++) {
            for (int j = i; j < numList.size(); j++) {
                int sum = numList.get(i) + k;
                if (sum < numList.get(j)) break;
                if (sum == numList.get(j)) cnt++;
            }
        }

        return cnt;

    }

}