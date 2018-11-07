package modulo1.i18n;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class EjemploFormateo {

    public static void main(String[] args) throws Exception {
        Locale es = new Locale("es");
        Locale en = Locale.ENGLISH;
        System.out.println("Numeros:");

        Integer quantity = new Integer(123456);
        Double amount = new Double(345987.246);
        NumberFormat numberFormatter = NumberFormat.getNumberInstance(es);
        System.out.println("ES:");
        System.out.println("\tquantity: " + numberFormatter.format(quantity));
        System.out.println("\tamount: " + numberFormatter.format(amount));
        numberFormatter = NumberFormat.getNumberInstance(en);
        System.out.println("EN:");
        System.out.println("\tquantity: " + numberFormatter.format(quantity));
        System.out.println("\tamount: " + numberFormatter.format(amount));
        
        System.out.println("Fechas");
        String pattern = "EEE, dd.MM.yy";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern, es);
        Date today = new Date();
        System.out.println("ES:");
        System.out.println("\tfecha: " + formatter.format(today));
        formatter = new SimpleDateFormat(pattern, en);
        System.out.println("EN:");
        System.out.println("\tfecha: " + formatter.format(today));
    }
}
