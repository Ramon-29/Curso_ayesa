
package modulo1.colecciones;

import java.util.PriorityQueue;

public class EjemploColas {
    public static void main(String[] args) throws Exception {
        PriorityQueue<Book> pq = new PriorityQueue<Book>();
        
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        
        pq.offer(b3);
        pq.offer(b1);
        pq.offer(b2);
        
        System.out.println(pq);
    }
}
