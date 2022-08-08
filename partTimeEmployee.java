public class partTimeEmployee extends Employee{
    private int workHours;
    private int wage;

    public partTimeEmployee(int id, String name, int workHours, int wage) {
        super(id, name);
        this.workHours = workHours;
        this.wage = wage;
    }
}



