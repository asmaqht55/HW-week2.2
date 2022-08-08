import java.util.ArrayList;
import java.util.PriorityQueue;

public class Company {
    private String name;
    private ArrayList<payable>Payable = new ArrayList<>();

    public Company(String name) {
             this.name=name;
    }
    public boolean add (payable p) {
        return Payable.add(p);
    }



    public double computeAmount() {
        double amount = 0;
        for (int i=0;i< Payable.size();i++){
            amount+=Payable.get(i).computeAmount();

    }
        return amount;
}
    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", Payable=" + Payable +
                '}';
    }
}
