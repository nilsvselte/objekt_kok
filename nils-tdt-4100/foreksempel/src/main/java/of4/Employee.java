package of4;

public class Employee {

    private Department employer;

    public Employee(Department employer){
        this.employer=employer;
        this.employer.addEmployee(this);
    }

    public void promote(){
        this.employer.removeEmployee(this);
        this.employer=this.employer.getParentDepartment();
        this.employer.addEmployee(this);


    }

    public void quit(){
        if (this.employer==null){
            throw new IllegalStateException();
        }
        this.employer.removeEmployee(this);
        this.employer=null;
    }



    
}
