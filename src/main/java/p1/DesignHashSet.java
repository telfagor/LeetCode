package p1;

import java.util.Random;
import java.util.Arrays;

public class DesignHashSet {
    static Integer[] array = new Integer[20];
    int realSize = 0;

    public void add(int key) {
        if (!contains(key) && realSize < array.length) {
            array[realSize] = key;
            realSize++;
        }
    }

    public void remove(int key) {
        if (contains(key)) {
            for (int i = 0; i < realSize; i++) {
                if (array[i] != null && array[i] == key) {
                    array[i] = null;
                }
            }
        }
    }

    public boolean contains(int key) {
        for (int i = 0; i < realSize; i++) {
            if (array[i] != null && array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DesignHashSet obj = new DesignHashSet();
        for (int i = 0; i < array.length; i++) {
            obj.add(new Random().nextInt(20));
        }

        System.out.println(Arrays.toString(array));
        System.out.println(obj.contains(7));
        obj.remove(7);
        System.out.println(obj.contains(7));

        System.out.println(Arrays.toString(array));
    }
}
