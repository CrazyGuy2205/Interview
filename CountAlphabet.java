package Interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountAlphabet {

    public static void main(String[] args) {
        String abc = "Arun Kurup";

        List<String > integerList = new ArrayList<>(Arrays.asList(abc.split("")));

       Map<String, Long> map = Arrays.stream(abc.split("")).collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));

        String xyz = map.entrySet().
        stream().max(Map.Entry.comparingByValue()).get().getKey();

        System.out.println(xyz+ "   " + map.get(xyz));
    } 
}
