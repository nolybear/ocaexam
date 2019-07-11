package maps;

import beans.Dog;
import beans.Mammal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BigMaps {

    public static void main(String[] args) {
        Map<Integer, Map<Integer, Object>> bigMap = new HashMap<>();

        Map<Integer, Object> innerMap1 = new HashMap<>();
        Map<Integer, Object> innerMap2 = new HashMap<>();
        Map<Integer, Object> innerMap3 = new HashMap<>();

        bigMap.put(1, innerMap1);
        bigMap.put(2, innerMap2);
        bigMap.put(3, innerMap3);

    }
}
