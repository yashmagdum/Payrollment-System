public class Fulltime extends Employe {
    private double MonthalySalary;

    public Fulltime(String name, int id ,double monthalySalary) {
        super(name, id);
        MonthalySalary = monthalySalary;
    }

    @Override
    double CalculateSalary() {
             return MonthalySalary;
    }
}
