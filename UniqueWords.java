package String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueWords {
    public static void main(String[] args) {
        String abc = "Arun Kurup is is idiot idiot";

        List<String> strList = Arrays.asList(abc.split("\\W"));
       strList.stream().forEach (x-> {
           if(Collections.frequency(strList, x) == 1 ){
               System.out.println(x);
           }
        });
    }
}
