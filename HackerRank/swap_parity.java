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

    public static String getLargestNumber(String num) {

        String[] arr = num.split("");

        for (int i = 0; i < arr.length; i++) {

            int cnt = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                int a = Integer.parseInt(arr[j]);
                int b = Integer.parseInt(arr[j + 1]);

                if ((a % 2 == 0 && b % 2 == 0) || (a % 2 != 0 && b % 2 != 0)) {
                    if (a < b) {
                        String tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                        cnt++;
                    }
                }
            }
            if (cnt == 0) break;

        }

        String result = "";
        for (String s : arr) {
            result += s;
        }

        return result;

    }

}