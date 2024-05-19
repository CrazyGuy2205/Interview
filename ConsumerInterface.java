package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4);

        Consumer<List<Integer>> integerConsumer = list->{
            for (int i=0;i<list.size();i++){
                list.set(i, list.get(i) * 2);
                System.out.println(" gk : "+list.get(i));
            }
        };

        Consumer<List<Integer>> integerConsumer2 = list-> list.forEach(System.out::println);

        integerConsumer.andThen(integerConsumer2).accept(integers);
    }
}
