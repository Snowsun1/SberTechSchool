package task3Generics2;


import java.util.ArrayList;
import java.util.List;


public class MainApp {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(3);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(1);
        arrayList1.add(4);
        arrayList1.add(5);
        System.out.println(arrayList);
        System.out.println(arrayList1);
        System.out.println("addAll");
        CollectionUtils.addAll(arrayList, arrayList1);
        System.out.println(arrayList1);
        System.out.println("indexOf");
        System.out.println(CollectionUtils.indexOf(arrayList1, 3));
        System.out.println("limits");
        System.out.println(CollectionUtils.limit(arrayList1, 3));
        System.out.println("add");
        CollectionUtils.add(arrayList, 1);
        System.out.println(arrayList);
        System.out.println("removeAll");
        CollectionUtils.removeAll(arrayList1, arrayList);
        System.out.println(arrayList1);
        System.out.println(arrayList);
        System.out.println("containAll");
        System.out.println(CollectionUtils.containsAll(arrayList, arrayList1));
        arrayList1.add(3);
        System.out.println("containAny");
        System.out.println(CollectionUtils.containsAny(arrayList, arrayList1));
        System.out.println("range without Comp");
        System.out.println(arrayList1);
        System.out.println(CollectionUtils.range(arrayList1, 2, 4));
        System.out.println("range with Comp");
        System.out.println(CollectionUtils.range(arrayList1, 2, 4, Integer::compareTo));
        List<Integer> list = CollectionUtils.newArrayList();


    }
}
