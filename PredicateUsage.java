package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateUsage {

    public static void main(String[] args) {
        Predicate<String> stringPredicate =new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.startsWith("A") || s.startsWith("P")){
                    return true;
                }else {
                    return false;
                }
            }
        };

        List<String> strings = new ArrayList<>();
        strings.add("Arun");
        strings.add("Satish");
        strings.add("Jibin");
        strings.add("Praveen");
        strings.add("Pavithra");
        strings.add("Megha");
        strings.add("Anjani");

        strings.stream().filter(stringPredicate).forEach(System.out::println);
    }
}
