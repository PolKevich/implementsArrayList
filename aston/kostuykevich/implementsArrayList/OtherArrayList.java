package by.aston.kostuykevich.implementsArrayList;

import java.util.Collection;
import java.util.Iterator;

public class OtherArrayList<E> implements BaseArrList<E>, BubbleSort {

    private E[] values;

    public OtherArrayList() {

        values = (E[]) new Object[0];
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {

        try {

            E[] a = (E[]) c.toArray();
            if (a.length == 0) {
                return false;
            }

            E[] otherArray = values;
            values = (E[]) new Object[otherArray.length + a.length + 1];
            System.arraycopy(otherArray, 0, values, 0, otherArray.length);
            System.arraycopy(a, 0, values, otherArray.length, a.length);
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void remove(int index) {

        try {

            E[] otherArray = values;
            values = (E[]) new Object[otherArray.length - 1];
            System.arraycopy(otherArray, 0, values, 0, index);
            int afterIndex = otherArray.length - index - 1;
            System.arraycopy(otherArray, index + 1, values, index, afterIndex);

        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public boolean add(E e) {

        try {
            E[] otherArray = values;
            values = (E[]) new Object[otherArray.length + 1];
            System.arraycopy(otherArray, 0, values, 0, otherArray.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(values);
    }

    @Override // не работает
    public void bubbleSort() {
//        boolean sorted = false;
//        int [] mas ;
//        int temp;
//        while (!sorted){
//            sorted = true;
//            for(int i = 0; i < mas.length - 1; i++){
//                if(mas[i] > mas[i + 1]){
//                    temp = mas[i];
//                    mas[i] = mas[i + 1];
//                    mas[i + 1] = temp;
//                    sorted = false;
    }
}



