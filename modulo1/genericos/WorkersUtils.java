
package modulo1.genericos;


public class WorkersUtils {
    public <T extends Person> String getJob(T person) {
        return person.getJob();
    }
 
    public static void main(String[] args) {
        Actor actor = new Actor("Michael", 23);
        Engineer engineer = new Engineer("Scott", 25);
 
        WorkersUtils wu = new WorkersUtils();
        System.out.println(wu.getJob(actor) + ", " + wu.getJob(engineer));
    }
}
