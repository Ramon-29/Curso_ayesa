package modulo1.colecciones;

import java.util.ArrayList;
import java.util.LinkedList;

public class EjemploListas {

    public static void main(String[] args) throws Exception {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

// ArrayList add
        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("#Add");
        System.out.println("ArrayList:  " + (duration / 1000000000.) + "s");

// LinkedList add
        startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList: " + (duration / 1000000000.) + "s");

        System.out.println("#Get");
// ArrayList get
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList:  " + (duration / 1000000000.) + "s");

// LinkedList get
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList: " + (duration / 1000000000.) + "s");

        System.out.println("#Remove");
// ArrayList remove
        startTime = System.nanoTime();

        for (int i = 9999; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList:  " + (duration / 1000000000.) + "s");

// LinkedList remove
        startTime = System.nanoTime();

        for (int i = 9999; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList: " + (duration / 1000000000.) + "s");
    }
}
