package task3ex5;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class MyIterator<T> implements Iterator {

    private List<T> list;
    private int index;

    MyIterator(List<T> list) {
        this.list = list;
        this.index = list.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return list != null && !list.isEmpty() && index > -1;
    }

    @Override
    public Object next() {
        if (! this.hasNext()) {
            throw new NoSuchElementException();
        }
        return list.get(index--);
    }
}
