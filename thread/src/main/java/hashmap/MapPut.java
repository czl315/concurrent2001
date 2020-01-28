package hashmap;

import java.util.Map;

/**
 * czl
 * createTime:2020/1/27
 */
public class MapPut implements Runnable{
    Map innerMap;
    int i;
    int j;

    public MapPut(Map map, int keyi, int valuej) {
        innerMap = map;
        i = keyi;
        j = valuej;
    }

    @Override
    public void run() {
        innerMap.put("key" + i, "value" + j);
    }
}
