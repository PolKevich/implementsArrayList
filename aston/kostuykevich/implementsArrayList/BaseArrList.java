package by.aston.kostuykevich.implementsArrayList;

import java.util.Collection;

public interface BaseArrList<E> extends Iterable<E> {
    boolean addAll(Collection<? extends E> c);

    void remove(int index);

    E get(int index);

    boolean add(E e);

    int size();
}
