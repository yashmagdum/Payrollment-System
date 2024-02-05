public class Usepayrollment {
    public static void main(String[] args){
        Payrollment obj = new Payrollment();
        Fulltime emp1 = new Fulltime("Vikas", 1 , 1500);
        Parttime emp2 = new Parttime("alex", 2,300);
        obj.addEmploye(emp1);
        obj.addEmploye(emp2);
        System.out.println("");
        System.out.println("Empolyee Details");
        obj.displayemployee();
        System.out.println("");
        System.out.println("Removing Employee");
        obj.removeEmploye(1);
        System.out.println("");
        System.out.println("Remaining  Empolyee");
        obj.displayemployee();

    }
}
