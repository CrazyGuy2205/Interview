package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortString {

    public static void main(String args[]){

        List<String> strings = new ArrayList<>();

        strings.add("Are you Okay");
        strings.add("Get Lost");
        strings.add("Welcome to Dubai");
        strings.add("Wallah Habibi Go to Dubai");

        Collections.sort(strings);

        System.out.println(strings);

        Collections.sort(strings, (o1, o2) -> {
            if(o1.length() > o2.length())
                return -1;
            else
                return 1;
        });

        System.out.println(strings);
    }
}
