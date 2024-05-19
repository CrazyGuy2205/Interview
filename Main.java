package Interview;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static int length;
    private static Map<Integer, String[]> letterMap;
    private static List<Integer> numOfDistinct;

    public static void main(String[] args) {
        Main main=new Main();
        System.out.println(main.solution("abc", "bcd"));
    }

    public int solution(String P, String Q) {
        if(P.equals(Q)){
            return P.length();
        }
        length = P.length();
        letterMap = new HashMap<>();

        for (int i = 0; i < length; i++) {
            letterMap.put(i, new String[] {String.valueOf(P.charAt(i)), String.valueOf(Q.charAt(i))});
        }

        numOfDistinct = new ArrayList<>();
        backtrack(new int[length], 0, new HashSet<>(), numOfDistinct);
        return Collections.min(numOfDistinct);
    }

    private void backtrack(int[] arr, int index, Set<Integer> distinctSet, List<Integer> numOfDistinct) {
        if (index == arr.length) {
            distinctSet.addAll(Arrays.stream(arr).boxed().collect(Collectors.toList()));
            numOfDistinct.add(distinctSet.size());
            return;
        }

        for (String letter : letterMap.get(index)) {
            if (!distinctSet.contains(letter)) {
                arr[index] = Integer.parseInt(letter);
                backtrack(arr, index + 1, distinctSet, numOfDistinct);
                arr[index] = 0;// Backtrack
            }
        }
    }
}