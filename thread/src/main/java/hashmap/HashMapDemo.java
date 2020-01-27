package hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * czl
 * createTime:2020/1/27
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        Object obj = map.put("akey", "avalue");

        if (obj != null) {
            System.out.println(obj.toString());
        }
        Object obj2 = map.put("akey", "avalue222");
        System.out.println(obj2.toString());
    }
}
