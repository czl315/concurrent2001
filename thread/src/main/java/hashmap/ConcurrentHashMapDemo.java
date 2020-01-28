package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * czl
 * createTime:2020/1/27
 */
public class ConcurrentHashMapDemo {
    static ConcurrentHashMap map = new ConcurrentHashMap();

    public static void main(String[] args) {
        concurrent(map, 10000);
    }

    private static void concurrent(Map map, int count) {
        for (int j = 0; j < count; j++) {
            map.put("key" + j, "value" + j);
            new Thread(new MapPut(map,j,j)).start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(map.size());
    }




}
