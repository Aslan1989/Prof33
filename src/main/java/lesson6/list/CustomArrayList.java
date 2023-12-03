package lesson6.list;

import java.sql.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CustomArrayList implements MyArrayList, Iterable<Integer> {

    public Iterator<Integer> smallToBigIterator()
    {
        return new SmallToBigIterator();
    }

    public class SmallToBigIterator implements Iterator<Integer>
    {
        private int [] source = new int[size];
        private int position = -1;

        public SmallToBigIterator()
        {
            System.arraycopy(data, 0, source,0,size);
            // скопировать данные из массива data в source
            Arrays.sort(source);

        }

        @Override
        public boolean hasNext() {
            return ++position < size;
        }

        @Override
        public Integer next() {
            if (position < 0 || position >= size)
                throw new NoSuchElementException();
            return source[position];
        }
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {
            private int position = -1;

            @Override
            public boolean hasNext() {
                    //position++;
                return ++position < size;
            }

            @Override
            public Integer next() {
                if (position < 0 || position >= size)
                    throw new NoSuchElementException();
                return data[position];
            }
            @Override
            public void remove()
            {
                if (position < 0 || position >= size)
                    throw new NoSuchElementException();
                CustomArrayList.this.remove(position);
            }
        };

    }
    public Iterator<Integer> backwardIterator()
    {

        return new Iterator<Integer>() {
            private int position = size;
            @Override
            public boolean hasNext() {
                return --position >= 0;
            }

            @Override
            public Integer next() {
                if (position < 0 || position >= size)
                    throw new NoSuchElementException();
                return data[position];
            }
        };
    }

    private int size = 0; // видимый для пользователя размер нашего ArrayList-a
    private int[] data;// массив в котором будут храниться элементы нашего ArrayList-a
    private static final int INITIAL_CAPACITY = 4; // начальный размер массива

    public CustomArrayList() {
        data = new int[INITIAL_CAPACITY]; // инициализируем массив размера INITIAL_CAPACITY
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value)
                return true;
        }
        return false;
    }

    @Override
    public void set(int index, int value) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        data[index] = value;
    }

    @Override
    public void add(int value) {
        if (size == data.length)
            increaseCapacity(); // служебный метод для создания массива в два раза больше и копирования в него данных
        data[size] = value;
        size++;
    }

    private void increaseCapacity() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) { // копирование данных из старого массива в новый
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public void add(int index, int value) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        if (size == data.length)
            increaseCapacity();
        // копируем элементы с конца
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = value;
        size++;
    }

    @Override
    public void remove(int index) {
        // проверить index
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        // скопировать данные
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        // сжать наш лист
        size--;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        return data[index];
    }

    @Override
    public String toString() {
        String r = "[";
        for (int i = 0; i < size; i++) {
            r += data[i];
            if (i < size - 1)
                r += ", ";
        }
        r += "]";
        return r;
    }
}
