
package modulo1.ficheros;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;


public class EjemploPath {
    public static void main(String[] args) throws Exception {
        Path path1 = Paths.get("/home/mgarciat/curso_java_path.txt");
        System.out.println(path1.toFile().exists());
        
        Path path2 = Paths.get(URI.create("file:///home/mgarciat/curso_java_path_uri.txt"));
        System.out.println(path2.toFile().exists());
    }
}
