package modulo1.i18n.etiquetas;

import java.util.ListResourceBundle;

public class CEtiquetas_en extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents = {
        {"titulo", "Conversation in english"},
        {"saludo1", "Hi"},
        {"saludo2", "Hello"},
        {"mensaje1", "How are you?"},
        {"mensaje2", "fine, and you?"},
        {"despedida1", "very good, bye"},
        {"despedida2", "bye"}
    };
}
