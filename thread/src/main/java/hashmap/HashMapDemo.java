package hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * czl
 * createTime:2020/1/27
 */
public class HashMapDemo {
    static Map map = new HashMap();

    public static void main(String[] args) {

//        Object obj = map.put("akey", "avalue");
//        if (obj != null) {
//            System.out.println(obj.toString());
//        }
//        Object obj2 = map.put("akey", "avalue222");
//        System.out.println(obj2.toString());

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
