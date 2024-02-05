abstract class Employe {
   private String Name;
   private int ID;

    public Employe(String name , int id) {
       this. Name = name;
        this.ID = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    abstract double CalculateSalary();



    public String toString(){
        return "Empolyee [Name" + Name+ ", id ="+ID + ", Salary = " + CalculateSalary() + "]";

    }


}

