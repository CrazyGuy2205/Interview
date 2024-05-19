package Interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedMap {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("abc", 126);
        map.put("xyz", 234);
        map.put("efg", 125);
        map.put("abcd", 111);

        HashMap<String, Integer> hashMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)-> e1, LinkedHashMap::new));

        hashMap.entrySet().forEach((e1)-> System.out.println(e1.getKey() + "   " +e1.getValue()));

    }
}
