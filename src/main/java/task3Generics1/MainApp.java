package task3Generics1;

import java.util.HashMap;

public class MainApp {
    public static void main(String[] args) {
        CountMap<Integer> map = new CountMapImpl<>();
        // Создание map2 для тестирования методов addAll и toMap с параметрами
        CountMap<Integer> map2 = new CountMapImpl<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(10, 2);


        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);
        map2.add(6);
        map2.add(5);
        map2.add(10);
        map.addAll(map2);
        map.toMap(hashMap);
        int count = map.getCount(5);  // 2
//        int count = map.getCount(6);  // 1
//        int count = map.getCount(10); // 3

        System.out.println(count);


    }
}
