package lesson7;

import lesson6.list.CustomArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorAndIterableForeach {
    //Foreach syntax
    // Iterators and Iterable
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>(Arrays.asList("Brazil", "Belgium", "France", "Spain"));
        for (String country : countries) { // foreach - используется только если нужно пройти все значения
            System.out.println(country);
        }

        CustomArrayList l = new CustomArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i)+" ");
        }
        System.out.println();

        // Iterator - способ обхода любого контейнера
        // в том числе который не поддерживает получение элемента по индексу
        // оперции в итераторе
        // 1. Спросить у опертора, есть ли у него след элемент boolean hasNext
        // 2. если след элемент есть то получить его(то есть hasNext() возвратил true), то получить его E next()
        Iterator<String> countriesIterator = countries.iterator();
        while (countriesIterator.hasNext())
            System.out.print(countriesIterator.next()+" ");

        System.out.println();
        for (int i: l
             ) {
            System.out.println(i);
        }


        System.out.println(check(Arrays.asList("Dima", "Masha"), Arrays.asList("Dima", "Masha")));
    }

    public static boolean check(List<String> f, List<String> s)
    {
//        for (int i = 0; i < f.size(); i++) {
//            if (f.get(i).equals(s.get(i)))
//                return true;
//        }
//        return false;
        return f.equals(s);
    }
}
