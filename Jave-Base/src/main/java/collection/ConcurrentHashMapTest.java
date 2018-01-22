package collection;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @Auther Dongqiang
 * @Date 2018/1/16 14:40
 */
public class ConcurrentHashMapTest {

    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> maps = new ConcurrentHashMap<>();
        for (int i = 0; i < 20; i++) {
            maps.put("key" + i, i);
        }
//        System.out.println(maps);
//        maps.put("key20", 11);
        String search = maps.search(2, (key, value) -> {
            if (value.equals(11)) return key;
            return null;
        });
        System.out.println(search);
        Integer entries = maps.searchEntries(1, map -> {
            if (map.getKey().equals("key1")) return map.getValue();
            return null;
        });
        System.out.println(entries);
        String key20 = Optional.ofNullable(maps.searchKeys(1, key -> key.equals("key2") ? key : null))
                .orElse("");

        System.out.println(key20);

        String reduceKey = maps.reduce(2, (key, value) -> key, (total, key) -> total + key);
        System.out.println("------------reduce" + reduceKey);

        Integer reduceValue = maps.reduce(2, (key, value) -> value, (basis, value) -> basis + value);
        System.out.println("------------reduce" + reduceValue);

        ConcurrentHashMap<Integer, String> intMap = new ConcurrentHashMap<>();
        for (int i = 0; i < 20; i++) {
            intMap.put(i, "value" + i);
        }

        Integer reduceKeys = intMap.reduceKeys(2, (key1, key2) -> key1.compareTo(key2) > 0 ? key1 : key2);
        System.out.println("----intMap---------" + reduceKeys);

        double toDouble = maps.reduceEntriesToDouble(1, Map.Entry::getValue, 0D, (basis, value) -> basis + value);
        System.out.println(toDouble);

        maps.forEach((key, value) -> System.out.print("forEach" + value));
        System.out.println();
        maps.forEach(2, (key, value) -> value + 1, value -> {
//            if (value == 0)
            System.out.print(value + "-");
        });

    }
}
