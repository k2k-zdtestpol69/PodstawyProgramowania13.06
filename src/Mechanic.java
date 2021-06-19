public class Mechanic extends Person {
    private String profession;

    public Mechanic(String name, String surname, int salary, String profession) {
        super(name, surname, salary);
        this.profession = profession;
    }
}
