package modulo1.genericos;

public class WorkerProfile<T extends Person> extends Worker<T> {

    public WorkerProfile(T person) {
        super(person);
    }

    @Override
    public String getJob() {
        return super.getJob() + ", " + person.getName() + ", " + person.getAge();
    }

    public static void main(String[] args) {
        Actor actor = new Actor("Michael", 23);
        Engineer engineer = new Engineer("Scott", 25);

        Worker<Actor> wa = new Worker<Actor>(actor);
        Worker<Engineer> we = new Worker<Engineer>(engineer);

        // No se puede hacer el casting, es un error habitual pensar que la herencia 
        // entre Person, Actor y Engineer se cumple de igual manera en el uso de los genéricos
        // Worker<Person> wkp1 = (Worker<Person>)wa;
        // Worker<Person> wkp2 = (Worker<Person>)we;
        // La herencia aplicada a genericos de forma correcta es asi
        WorkerProfile<Person> workerProfile = new WorkerProfile<Person>(engineer);
        Worker<Person> worker = (Worker<Person>) workerProfile;
        System.out.println(workerProfile.getJob());
        System.out.println(worker.getJob());
    }
}
