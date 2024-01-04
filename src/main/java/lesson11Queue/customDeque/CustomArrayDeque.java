package lesson11Queue.customDeque;

public class CustomArrayDeque  implements CustomDeque{

    private int [] source; // массив с элементами
    private int  size = 0; // сколько элементов в CustomArrayDeque
    private int firstElementIndex = 0; // индекс первого элемента CustomArrayDeque

    private static final int CAPACITY =4; // начальный размер массива

    @Override
    public String toString()
    {
        String r = "[";
        for (int i = 0; i < size; i++) {
            int v = source[ (firstElementIndex +i) % source.length];
            r += v;
            if (i < size() -1)
                r += ", ";
        }
        r += "]";
        return r;
    }

    public CustomArrayDeque() {
        source = new int[CAPACITY];
    }

    @Override
    public void addFirst(int value) {
        if (size() == source.length)
            increaseCapacity(); // делаем новый массив в 2 раза больше

        // уменьшить firstElementIndex
        firstElementIndex = (firstElementIndex -1 + source.length) % source.length;
        // добавить с source значение value по индексу firstElementIndex
        source[firstElementIndex] = value;
        size++;
    }

    @Override
    public void addLast(int value) {
        if (size() == source.length)
            increaseCapacity();

        int lastElementIndex = (firstElementIndex+ size()) % source.length;
        source[lastElementIndex] = value;
        size++;
    }

    private void increaseCapacity() {
        int[] newSource = new int[source.length*2];
        int j = 0;
        for (int i = firstElementIndex; i < source.length; i++) {
            newSource[j++] = source[i];
        }
        for (int i = 0; i < firstElementIndex; i++) {
            newSource[j++] = source[i];
        }
        firstElementIndex = 0;
        source = newSource;
    }

    @Override
    public int getFirst() throws IndexOutOfBoundsException {
        if (size() == 0)
            throw  new IndexOutOfBoundsException();
        return source[firstElementIndex];
    }

    @Override
    public int removeFirst() throws IndexOutOfBoundsException {
        if (size() == 0)
            throw  new IndexOutOfBoundsException();
        // сохранитть значение 1 first ElementIndex
        int value = source[firstElementIndex];
        // увеличить на 1 first ElementIndex
        firstElementIndex = (firstElementIndex+1) % source.length;
        // уменьшить size на 1
        size--;
        // возвращаем сохраненное значение
        return value;
    }



    @Override
    public int getLast() throws IndexOutOfBoundsException {
        // если size() == 0 То выбросить исключение
        if (size() == 0)
            throw  new IndexOutOfBoundsException();
        int value = (firstElementIndex+ size() -1) % source.length;
        return source[value];
    }

    @Override
    public int removeLast() throws IndexOutOfBoundsException {

        if (size() == 0)
            throw  new IndexOutOfBoundsException();
        int lastElementIndex = (firstElementIndex +size() -1) % source.length;
        int value = source[lastElementIndex];
        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }
}
