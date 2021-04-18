package task3Generics1;

import java.util.HashMap;
import java.util.Map;


public class CountMapImpl<T> implements CountMap<T>{

    private final HashMap<T, Integer> hashmap;

    CountMapImpl() {
        this.hashmap = new HashMap<>();
    }

    @Override
    public void add(T t) {
        hashmap.put(t, hashmap.getOrDefault(t, 0) + 1);
    }

    @Override
    public int getCount(T t) {
        if (hashmap.containsKey(t)) {
            return hashmap.get(t);
        }
        return 0;
    }

    @Override
    public int remove(T t) {
        if (hashmap.getOrDefault(t, 0) == 0) {
            return 0;
        }
        return hashmap.remove(t);
    }

    @Override
    public int size() {
        return hashmap.size();
    }

    @Override
    public void addAll(CountMap<? extends T> source) {
        if (source != null) {
            Map<T, Integer> hashMapSour = new HashMap<>(source.toMap());
            for (Map.Entry<T, Integer> pair : hashMapSour.entrySet()) {
                hashmap.put(pair.getKey(), hashmap.getOrDefault(pair.getKey(), 0) + pair.getValue());
            }
        }

    }

    @Override
    public Map<T, Integer> toMap() {
        return new HashMap<>(hashmap);
    }
    // Записись в destination с учётом того что в нём лежало ранее
    @Override
    public void toMap(Map<T, Integer> destination) {
        if (destination != null) {
            for (Map.Entry<T, Integer> pair : destination.entrySet()) {
                hashmap.put(pair.getKey(), hashmap.getOrDefault(pair.getKey(), 0) + pair.getValue());
            }
            destination.putAll(hashmap);
        }

    }
}
