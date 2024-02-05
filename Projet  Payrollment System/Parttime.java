public class Parttime extends Employe{
    private int hoursworked;
    private double Rate;

    public Parttime(String name, int id, int hoursworked) {
        super(name, id);
        this.hoursworked = hoursworked;
        this.Rate = Rate;
    }

    @Override
    double CalculateSalary() {
        return hoursworked * Rate;
    }
}
