package Interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap();
        map.put(1,1);
        map.put(2,2);
        map.put(3,13);

        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            Integer key =  iterator.next();
            System.out.println(" value   " + map.get(key));
            if(key==2){
                map.put(4,14);
            }
        }
     }
}
