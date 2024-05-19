package Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int a[]={2,4,5,6,8};
        int b[] = {1,3,5,7,9};
        List<Integer> intA =Arrays.stream(b).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Arrays.stream(b).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        int i =0,j =0,k =0;
        int c[] = new int[a.length+ b.length];
        for(i = 0; j<a.length && k<b.length ; i++){
           if(a[j] < b[k]){
                c[i] = a[j];
                j++;
            }else {
                c[i] = b[k];
                k++;
            }
        }
        if(j > k && k >= b.length-1){
            c[i] = b[k];
        } else if (k > j && j >= a.length-1) {
            c[i] = a[j];
        }
        Arrays.stream(c).forEach(System.out::print);
    }
}
