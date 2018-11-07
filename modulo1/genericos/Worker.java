package modulo1.genericos;

public class Worker<T extends Person> {

    protected Person person;

    public Worker(T person) {
        this.person = person;
    }

    public String getJob() {
        return this.person.getJob();
    }

    public static void main(String[] args) {
        Actor actor = new Actor("Michael", 23);
        Engineer engineer = new Engineer("Scott", 25);

        Worker<Actor> wk1 = new Worker<Actor>(actor);
        Worker<Engineer> wk2 = new Worker<Engineer>(engineer);
        System.out.println(wk1.getJob() + ", " + wk2.getJob());
    }
}
