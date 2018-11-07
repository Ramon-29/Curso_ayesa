package modulo1.colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploConjuntos {

    public static void main(String[] args) throws Exception {
        System.out.println("Hash set");
        Set<Book> set = new HashSet<Book>();
        //Creating Books  
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to HashSet  
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing HashSet  
        for (Book b : set) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
        System.out.println("Tree set");
        set = new TreeSet<Book>();
        //Creating Books  
        //Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        //Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        //Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        //Adding Books to TreeSet  
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing TreeSet  
        for (Book b : set) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }

    }
}
