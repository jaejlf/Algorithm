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

    public static int balancedSum(List<Integer> arr) {
        
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        
        for(int i = 1; i < arr.size() - 1; i++) {
            
            int halfSum = (sum - arr.get(i)) / 2;
            
            int rightSum = 0;
            for(int j = i + 1; j < arr.size(); j++) {
                rightSum += arr.get(j);
            }
            
            if(halfSum == rightSum) return i;
            
        }
        
        return -1;
        
    }

}