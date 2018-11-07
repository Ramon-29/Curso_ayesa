
package modulo1.ficheros;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;


public class EjemploFicherosUnaPasada {
    public static void main(String[] args) throws Exception {
        System.out.println("=================== realAllBytes");
        Path ipath = Paths.get("ficheros/iris.arff");
        byte[] irisArray = Files.readAllBytes(ipath);
        String irisString = new String(irisArray);
        System.out.println(irisString);
        
        Path opath = Paths.get("ficheros/iris.output.arff");
        Files.write(opath, irisArray);
        
        //=====================
        System.out.println("=================== realAllLines");
        List<String> lines = Files.readAllLines(ipath);
        Iterator<String> ilines = lines.iterator();
        while (ilines.hasNext()) {
            String line = ilines.next();
            System.out.println(line);
        }
        
        opath = Paths.get("ficheros/iris.output2.arff");
        Files.write(opath, lines);
        
    }
}
