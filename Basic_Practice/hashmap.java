import java.util.*;

public class hashmap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("해시", 100);
        map.put("맵", 30);
        map.put("스터디", 77);

        System.out.println(map.get("해시"));
        System.out.println(map.values());

        map.remove("해시");
        System.out.println(map.values());

        for(String i : map.keySet()){
            System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
        }

    }
}
