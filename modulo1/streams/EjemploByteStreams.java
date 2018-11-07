
package modulo1.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class EjemploByteStreams {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("ficheros/xanadu.txt");
            out = new FileOutputStream("ficheros/out.xanadu.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally { //cierre de los flujos. Muy importante
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
