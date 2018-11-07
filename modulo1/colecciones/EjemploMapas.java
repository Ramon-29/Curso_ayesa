
package modulo1.colecciones;

import java.util.HashMap;
import java.util.Map;


public class EjemploMapas {
    public static void main(String[] args) throws Exception {
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        
        Map<Integer, Book> map = new HashMap<Integer, Book>();
        
        map.put(b1.id, b1);
        map.put(b3.id, b3);
        map.put(b2.id, b2);
        
        System.out.println(map);
    }
}
