package lesson6.list;
// интерфейс это набок методов, которые должы реализовывать наследники
// контракт - которому должны следовать дочерние классы
public interface MyArrayList {
    int size();
    boolean contains(int value); // есть ли такой элемент в списке или нет
    void set(int index, int value); // изменение значения по индексу
    void add(int value); // добавление в конец
    void add(int index, int value); // добавление в определенное место
    void remove(int index); // удаление по индексу
    int get(int index);

}
