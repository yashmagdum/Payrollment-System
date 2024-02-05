import java.lang.reflect.Array;
import java.util.ArrayList;

public class Payrollment {
    private ArrayList<Employe> employelist;

    public Payrollment(){
        employelist = new ArrayList<>();
    }
    public void addEmploye(Employe employe){
        employelist.add(employe);
    }
    public void removeEmploye(int id){
        Employe employToRemove = null;
        for(Employe employe : employelist){
            if(employe.getID() == id){
              employToRemove = employe;
              break;
            }
        }
        if(employToRemove != null){
            employelist.remove(employToRemove);
        }
    }
    public void displayemployee(){
        for (Employe employe : employelist){
            System.out.println(employe);
        }
    }
}
