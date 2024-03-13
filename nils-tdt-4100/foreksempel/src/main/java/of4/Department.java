package of4;

import java.util.ArrayList;
import java.util.Collection;

public class Department {

    private Department parentDepartment;
    Collection<Department> subDepartments = new ArrayList<>();
    Collection<Employee> employees = new ArrayList<>();

    public Department(Department parentDepartment){
        this.parentDepartment = parentDepartment;
        this.parentDepartment.addSubDepartment(this);
    }

    public Department(){

    }

    public Department getParentDepartment(){
        return this.parentDepartment;
    }

    private void addSubDepartment(Department subDepartment){
        if (this.subDepartments.contains(subDepartment)){
            throw new IllegalArgumentException("Allerede eksisterende");
        }
        this.subDepartments.add(subDepartment);

    }

    public boolean containsDep(Department other){
        for (Department department : this.subDepartments){
            if (department == other || department.subDepartments.contains(other)){
                return true;

            }

        }
        return false;
    }

    public void addEmployee(Employee employee){
        if (this.employees.contains(employee)){
            throw new IllegalArgumentException("Allerede ansatt");
        }
        this.employees.add(employee);

    }

    public void removeEmployee(Employee employee){
        if (! this.employees.contains(employee)){
            throw new IllegalArgumentException();
        }
        this.employees.remove(employee);

    }




    public static void main(String[] args) {
        Department test = new Department();
        
    }
    
}
