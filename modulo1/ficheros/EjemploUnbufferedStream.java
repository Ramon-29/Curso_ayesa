package modulo1.ficheros;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.CREATE;

public class EjemploUnbufferedStream {

    public static void main(String[] args) throws Exception {
        Path ifile = Paths.get("ficheros/iris.arff");
        Path ofile = Paths.get("ficheros/iris.output4.arff");

        InputStream in = Files.newInputStream(ifile);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        OutputStream out = new BufferedOutputStream( Files.newOutputStream(ofile, CREATE));//, APPEND));
        
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            String aux = line + "\n";
            out.write(aux.getBytes());
            
        }
        
        reader.close();
        in.close();
        out.close();
        //    writer.close ();
    }
}
