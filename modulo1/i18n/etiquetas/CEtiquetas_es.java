package modulo1.i18n.etiquetas;

import java.util.ListResourceBundle;

public class CEtiquetas_es extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents = {
        {"titulo", "Conversacion en español"},
        {"saludo1", "Hola"},
        {"saludo2", "Hola"},
        {"mensaje1", "¿Como estas?"},
        {"mensaje2", "bien, ¿y tu?"},
        {"despedida1", "bien, adios"},
        {"despedida2", "adios"}
    };
}
