package Interview;

import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteAl {

    public static void main(String args[]) {

        CopyOnWriteArrayList<Integer> integers = new CopyOnWriteArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        Iterator<Integer> iterator = integers.iterator();
        while(iterator.hasNext()){
            Integer value = iterator.next();
            if(value ==2){
                integers.add(6);
            }
            System.out.println(value + " size : " + integers.size());
        }
        iterator = integers.iterator();
        while(iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println(value + " size : " + integers.size());
        }


    }
}
