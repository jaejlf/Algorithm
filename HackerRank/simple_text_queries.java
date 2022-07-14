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

    public static List<List<Integer>> textQueries(List<String> sentences, List<String> queries) {

        List<List<Integer>> result = new ArrayList<>();

        for (String query : queries) {

            List<Integer> indexList = new ArrayList<>();
            List<String> qList = Arrays.asList(query.split(" "));

            for (int i = 0; i < sentences.size(); i++) {
                List<String> sList = Arrays.asList(sentences.get(i).split(" "));
                if (sList.containsAll(qList)) indexList.add(i);
            }

            if (indexList.isEmpty()) indexList.add(-1);
            result.add(indexList);

        }

        return result;

    }

}