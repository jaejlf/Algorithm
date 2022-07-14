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

    public static String compressWord(String word, int k) {

        String[] tmp = word.split("");
        Set<String> set = new HashSet<>(Arrays.asList(tmp));
        List<String> arr = new ArrayList<>(set);

        for (int i = 0; i < arr.size(); i++) {
            String newStr = "";
            for (int j = 0; j < k; j++) {
                newStr += arr.get(i);
            }
            arr.set(i, newStr);
        }

        while (true) {
            int cnt = 0;
            for (String s : arr) {
                if (word.contains(s)) {
                    word = word.replace(s, "");
                    cnt++;
                }
            }
            if (cnt == 0) break;
        }

        return word;

    }

}