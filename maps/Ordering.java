package maps;

import java.util.*;

public class Ordering {

    public static void main(String args[]) {
        List<String> values = Arrays.asList("fish", "dog", "cat");
        values.stream().forEach(val -> System.out.println("List: " + val));

        HashMap hashMap = new LinkedHashMap();
        values.stream().forEach(val -> hashMap.put(val, val));
        hashMap.keySet().stream().forEach(val -> System.out.println("hashMap: " + val));

        Map map = new LinkedHashMap();
        values.stream().forEach(val -> map.put(val, val));
        map.keySet().stream().forEach(val -> System.out.println("map: " + val));

    }
}
