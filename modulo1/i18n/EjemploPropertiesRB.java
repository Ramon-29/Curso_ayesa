
package modulo1.i18n;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;


public class EjemploPropertiesRB {

    
    public static void conversacion(ResourceBundle labels) {
        String saludo1 = labels.getString("saludo1");
        String saludo2 = labels.getString("saludo2");
        
        String msj1 = labels.getString("mensaje1");
        String msj2 = labels.getString("mensaje2");
        
        String desp1 = labels.getString("despedida1");
        String desp2 = labels.getString("despedida2");
        
        String titulo = labels.getString("titulo");
        
        System.out.println("::::::::::::::::::::::::::::::\n" + titulo);
        System.out.println("a>" + saludo1);
        System.out.println("b>" + saludo2);
        
        System.out.println("a>" + msj1);
        System.out.println("b>" + msj2);
        
        System.out.println("a>" + desp1);
        System.out.println("b>" + desp2);
    }
    
    public static void main(String[] args) throws Exception {
        Locale es = new Locale("es");
        Locale en = Locale.ENGLISH;
        
        ResourceBundle rb_es = ResourceBundle.getBundle("modulo1.i18n.etiquetas.MisEtiquetas", es);
        EjemploPropertiesRB.conversacion(rb_es);
        
        ResourceBundle rb_en = ResourceBundle.getBundle("modulo1.i18n.etiquetas.MisEtiquetas", en);
        EjemploPropertiesRB.conversacion(rb_en);
        /*
        File file = new File("src/modulo1/i18n/etiquetas");
        URL[] urls = {file.toURI().toURL()};
        ClassLoader loader = new URLClassLoader(urls);
        ResourceBundle rb_en2 = ResourceBundle.getBundle("MisEtiquetas", en, loader);
        EjemploPropertiesRB.conversacion(rb_en2);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //////////////////////////////
        ResourceBundle crb_es = ResourceBundle.getBundle("modulo1.i18n.etiquetas.CEtiquetas", es);
        EjemploPropertiesRB.conversacion(crb_es);
        
        ResourceBundle crb_en = ResourceBundle.getBundle("modulo1.i18n.etiquetas.CEtiquetas", en);
        EjemploPropertiesRB.conversacion(crb_en);*/
    }
}
