package lesson11Queue.customDeque;

public interface CustomDeque {
    void addFirst(int value); // добавление элемента в начало
    int getFirst() throws IndexOutOfBoundsException; // посмотреть первый элемент без удаление
    int removeFirst() throws IndexOutOfBoundsException; // получить первый элемент и удалить его

    void addLast(int value); // добавление в конец
    int getLast() throws IndexOutOfBoundsException; // посмотреть повслдений элемент без удаления
    int removeLast() throws IndexOutOfBoundsException; // посмтореть послдений элемент и удалить его

    int size(); // сколько элементов
}
