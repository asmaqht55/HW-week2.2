public class Fulltime extends Employee {
    private int weeklySalary;
    public int fulltime(int weeklySalary ){
        this.weeklySalary=weeklySalary;

        return weeklySalary;
    }

    public Fulltime(int id, String name) {
        super(id, name);
    }
}
