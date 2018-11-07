package modulo1.genericos;

public class Actor extends Person {

    public Actor(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String getJob() {
        return "Actor";
    }
}
