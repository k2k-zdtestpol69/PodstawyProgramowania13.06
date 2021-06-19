public class Accountant extends Person{
    private int workingHours;

    public Accountant(String name, String surname, int salary, int workingHours) {
        super(name, surname, salary);
        this.workingHours = workingHours;
    }
}
