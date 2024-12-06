package lecture.Giris;

import java.lang.reflect.Array;

public class Main<T> {
    public static void main(String[] args) {
        Main.makeIntArr(10);

        Main<String> m = new Main<>();
        String[] sArr = m.makeTArrBasedOnClass(String.class, 10);
        for(String s : sArr) System.out.print(s + " ");
    }
    public static int[] makeIntArr(int size){
        return new int [size];
    }
    public T[] makeTArr(int size){
        return (T[]) new Object[size];
    }

    public T[] makeTArrBasedOnClass(Class<T> myClass,int size){
        return (T[]) Array.newInstance(myClass, size);
    }
}
