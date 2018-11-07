package modulo1.i18n;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class EjemploI18nRBProperties2 {

    static void displayValue(Locale currentLocale, String key) throws MalformedURLException {

        File file = new File("src/modulo1/internacionalizacion");
        URL[] urls = {file.toURI().toURL()};
        ClassLoader loader = new URLClassLoader(urls);
        
        ResourceBundle labels
                = ResourceBundle.getBundle("LabelsBundle", currentLocale, loader);

//                = ResourceBundle.getBundle("modulo1.internacionalizacion.LabelsBundle", currentLocale);
        String value = labels.getString(key);
        System.out.println(
                "Locale = " + currentLocale.toString() + ", "
                + "key = " + key + ", "
                + "value = " + value);

    } // displayValue
    
    static void iterateKeys(Locale currentLocale) {

        ResourceBundle labels
                = ResourceBundle.getBundle("modulo1.internacionalizacion.LabelsBundle", currentLocale);

        Enumeration bundleKeys = labels.getKeys();

        while (bundleKeys.hasMoreElements()) {
            String key = (String) bundleKeys.nextElement();
            String value = labels.getString(key);
            System.out.println("key = " + key + ", "
                    + "value = " + value);
        }

    } // iterateKeys

    static public void main(String[] args) throws Exception {

        Locale[] supportedLocales = {
            Locale.FRENCH,
            Locale.GERMAN,
            Locale.ENGLISH,
            new Locale("es", "ES")
        };

        for (int i = 0; i < supportedLocales.length; i++) {
            displayValue(supportedLocales[i], "s1");
        }

        System.out.println();

        iterateKeys(supportedLocales[0]);

    } // main
}
