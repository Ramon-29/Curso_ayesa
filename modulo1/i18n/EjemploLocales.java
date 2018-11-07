package modulo1.i18n;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class EjemploLocales {

    public static void main(String[] args) throws Exception {
        //LocaleBuilder
        Locale caLocale = new Locale.Builder().setLanguage("fr").setRegion("CA").build();
        Locale esLocale = new Locale.Builder().setLanguage("es").setRegion("ES").build();
        Locale usLocale = new Locale.Builder().setLanguage("en").setRegion("US").build();
        Locale ruLocale = new Locale.Builder().setLanguage("ru").setScript("Cyrl").build();

        System.out.println("LocaleBuilder");
        System.out.println(caLocale);
        System.out.println(esLocale);
        System.out.println(usLocale);
        System.out.println(ruLocale);

        //Locale constructor
        caLocale = new Locale("fr", "CA");
        esLocale = new Locale("es", "ES");
        usLocale = new Locale("en", "US");
        ruLocale = new Locale("ru");
        
        System.out.println("Locale constructor");
        System.out.println(caLocale);
        System.out.println(esLocale);
        System.out.println(usLocale);
        System.out.println(ruLocale);
        
        //forLanguageTag Factory method
        usLocale = Locale.forLanguageTag("en-US");
        esLocale = Locale.forLanguageTag("es-ES");
        Locale jaLocale = Locale.forLanguageTag("ja-JP-u-ca-japanese");
        
        System.out.println("forLanguageTag Factory method");
        System.out.println(esLocale);
        System.out.println(usLocale);
        System.out.println(jaLocale);
        
        //Locale constants
        Locale ukLocale = Locale.UK;
        jaLocale = Locale.JAPAN;
        
        //NumberFormat
        double value = 2.374;
        NumberFormat nf = NumberFormat.getInstance(esLocale);
        System.out.println("ES: " + nf.format(value));
        nf = NumberFormat.getInstance(usLocale);
        System.out.println("US: " + nf.format(value));
        nf = NumberFormat.getInstance(caLocale);
        System.out.println("CA: " + nf.format(value));
        
//        DateFormat df = DateFormat.getDateInstance("dd/MM/YYYY", jaLocale);
    }
}
