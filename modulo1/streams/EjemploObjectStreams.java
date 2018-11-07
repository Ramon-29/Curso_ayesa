
package modulo1.streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EjemploObjectStreams {
    public static void main(String[] args) throws Exception {
        String fname = "ficheros/ostreams.obj";
        
        MiClase o = new MiClase();
        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fname)));
        out.writeObject(o);
        out.writeObject(o);
        out.flush();
        out.close();
        
        ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fname)));
        
        Object o1 = in.readObject();
        Object o2 = in.readObject();
        System.out.println((o1 == o2));
        in.close();
    }
}
