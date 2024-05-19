package Interview;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static int minDistinctLetters(String P, String Q) {
        if (P.equals(Q)) {
            return P.length();
        }
        String R = P.concat(Q);
        Set<Character> characterSet = new HashSet<>();
        Set<Character> characterSet1 = new HashSet<>();
        for(char c: R.toCharArray()){
            if(characterSet.contains(c)){
                characterSet.remove(c);
                characterSet1.add(c);
            }else if(!characterSet1.contains(c)){
                characterSet.add(c);
            }
        }
        return characterSet.size();
    }


    public static void main(String[] args) {
        String P = "axxz";
        String Q = "yzwy";
        int result = minDistinctLetters(P, Q);
        System.out.println(result);  // Output: 2
    }
}