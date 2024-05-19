package Interview;

public class TargetInddex {

    public static void main(String[] args) {
        Integer key = 12;
        Integer[] abc = new Integer[5];
        abc[0] = 2;
        abc[1] = 9;
        abc[2] = 1;
        abc[3] = 3;
        abc[4] = 4;
        extracted(abc, key);
    }

    private static void extracted(Integer[] abc, Integer key) {
        for (int i = 0; i < abc.length - 1; i++) {
            for (int j = 1; j < abc.length; j++) {
                if(abc[i] + abc[j] == key){
                    System.out.println( i + "   " + j);
                    return;
                }
            }
        }
    }
}
