package exercises.Task1;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Object array = Array.newInstance(int.class, 10);

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 10) + 1;
            Array.set(array, i, random);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(Array.get(array, i) + " ");
        }
    }
}
