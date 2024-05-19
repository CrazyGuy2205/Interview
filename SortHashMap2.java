package Interview;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMap2 {

    public static void main(String args[]) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("English", 80);
        hashMap.put("Marathi", 78);
        hashMap.put("History", 87);
        hashMap.put("Science", 90);
        hashMap.put("Maths", 92);
        hashMap.put("Hindi", 65);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(" Subject : " + entry.getKey() + " Marks : " + entry.getValue());
        }

        Map<String,Integer> sortedHashMap = hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1,LinkedHashMap::new));

        sortedHashMap.forEach((key, value) -> System.out.println(" Subject : " + key + " Marks : " + value));

    }

}
