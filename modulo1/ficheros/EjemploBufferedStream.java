package modulo1.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EjemploBufferedStream {

    public static void main(String[] args) throws Exception {
        Charset charset = Charset.forName("UTF-8");
        Path file = Paths.get("ficheros/iris.arff");
        Path ofile = Paths.get("ficheros/iris.output3.arff");
        BufferedReader reader = Files.newBufferedReader(file, charset);
        BufferedWriter writer = Files.newBufferedWriter(ofile, charset);
        
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            writer.write(line + "\n");
        }
        reader.close();
        writer.close();
        
        
    }
}
