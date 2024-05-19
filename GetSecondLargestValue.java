package Interview;

import java.util.Arrays;
import java.util.List;

public class GetSecondLargestValue {

    public static void main(String args[]){
        List<Integer> abc = Arrays.asList(1200, 234, 45, 35, 456, 46);
        int max=abc.get(0), max2=0;
        for(int i =1; i< abc.size();i++){
            if(max < abc.get(i)){
                max2= max;
                max = abc.get(i);
            }else if(max2 < abc.get(i)){
                max2= abc.get(i);
            }
        }

        System.out.println(max2);

    }
}
