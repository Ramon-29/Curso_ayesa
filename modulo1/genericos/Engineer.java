package modulo1.genericos;

public class Engineer extends Person {

    public Engineer(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String getJob() {
        return "Engineer";
    }
}
