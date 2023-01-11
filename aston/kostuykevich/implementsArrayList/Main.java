package by.aston.kostuykevich.implementsArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BaseArrList<String> list = new OtherArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        ArrayList <String> arr = new ArrayList();
        arr.add("four");
        arr.add("five");

        System.out.println(list.size());
        list.addAll(arr);
        System.out.println(list.size());

        for (String str:list) {
            System.out.println(str);
        }

//        System.out.println(list.size());
//        System.out.println(list.get(1));
//        list.remove(1);
//        System.out.println(list.size());
//        System.out.println(list.get(1));
    }
}
