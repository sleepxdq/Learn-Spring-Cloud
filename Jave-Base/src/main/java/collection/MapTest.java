package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther Dongqiang
 * @Date 2018/1/15 16:32
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put("key" + i, "key" + i);
        }

        if (map.get("key1").equals("key1"))
            System.out.println(map.get("key1"));
        else if (map.get("key2").equals("key2"))
            System.out.println(map.get("key2"));
        else
            System.out.println(map.get("key3"));
    }
}
