package Interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMap {

    public static void main(String args[]){
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("English", 80);
        hashMap.put("Marathi", 78);
        hashMap.put("History", 87);
        hashMap.put("Science", 90);
        hashMap.put("Maths", 92);
        hashMap.put("Hindi", 65);

       for (Map.Entry<String,Integer> entry : hashMap.entrySet()){
           System.out.println(" Subject : "+ entry.getKey() + " Marks : " +entry.getValue());
       }

       System.out.println(" ****** After Sorting *******");
       HashMap<String,Integer> sortedHashMap =  sortByValue(hashMap);

       for(Map.Entry<String,Integer> entry : sortedHashMap.entrySet()){
           System.out.println(" Subject : "+ entry.getKey() + " Marks : "+ entry.getValue());
       }

    }

    public static HashMap<String,Integer> sortByValue(HashMap<String, Integer> hashMap){
        return hashMap.entrySet().stream().sorted((i1,i2) ->{
            if (i1.getValue() > i2.getValue())
                return -1;
            else
                return 1;
        }).collect(Collectors.toMap(Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1, LinkedHashMap::new));
    }

}
