package task3ex5;


import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }
        MyIterator<Integer> myIterator = new MyIterator<>(arrayList);
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }



    }
}
