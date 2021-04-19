package task3Generics2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionUtils<T> {

    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    public static <T> int indexOf(List<T> source, T t) {
        return source.contains(t) ? source.indexOf(t) : -1;
    }

    public static <T> List<T> limit(List<T> source, int size) {
        return source.size() >= size ? new ArrayList<>(source.subList(0, size)) : null;
    }

    public static <T> void add(List<? super T> source, T t) {
        source.add(t);
    }

    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static <T> boolean containsAll(List<T> c1, List<T> c2) {
        return c1.containsAll(c2);
    }

    public static <T> boolean containsAny(List<? super T> c1, List<? extends T> c2) {
        return !Collections.disjoint(c1, c2);
    }

    public static <T extends Comparable<T>> List<T> range(List<T> list, T min, T max) {
        return list.stream().filter(x -> x.compareTo(min) >= 0 && x.compareTo(max) <= 0).collect(Collectors.toList());
    }

    public static <T extends Comparable<T>> List<T> range(List<T> list, T min, T max, Comparator<T> comparator) {
        return list.stream().filter(x -> comparator.compare(x, min) >= 0 && comparator.compare(x, max) <= 0).collect(Collectors.toList());
    }

}

