
package modulo1.streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploCharacterStreams {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("ficheros/xanadu.txt");
            outputStream = new FileWriter("ficheros/character.xanadu.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
