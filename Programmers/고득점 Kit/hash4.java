// 베스트 앨범

import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> genresMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            genresMap.put(genres[i], genresMap.getOrDefault(genres[i], 0) + plays[i]);
        }

        HashMap<Integer, Integer> playsMap = new HashMap<>();
        for (int i = 0; i < plays.length; i++) {
            playsMap.put(i, plays[i]);
        }

        // 1. 장르별 전체 재생 횟수가 많은 장르 순으로 정렬
        ArrayList<String> sortedGenres = new ArrayList<>(genresMap.keySet());
        Collections.sort(sortedGenres, (o1, o2) -> genresMap.get(o2).compareTo(genresMap.get(o1)));

        // 2. 장르 내에서 많이 재생된 노래 순으로 정렬
        ArrayList<Integer> sortedMusic = new ArrayList<>(playsMap.keySet());
        Collections.sort(sortedMusic, (o1, o2) -> playsMap.get(o2).compareTo(playsMap.get(o1)));

        // 3. 베스트 앨범
        ArrayList<Integer> bestAlbum = new ArrayList<>();
        for (String genre : sortedGenres) {
            int count = 1;
            for (int i : sortedMusic) {
                if (genres[i].equals(genre) && count < 3) {
                    bestAlbum.add(i);
                    count++;
                }
            }
        }

        int[] answer = new int[bestAlbum.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = bestAlbum.get(i);
        }

        return answer;

    }
}