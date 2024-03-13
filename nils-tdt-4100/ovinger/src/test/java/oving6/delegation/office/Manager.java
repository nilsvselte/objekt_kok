package oving6.delegation.office;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Manager implements Employee{
    

    Collection<Employee> employees;
    //Constructor
    public Manager(Collection<Employee> employees){
        this.employees=employees;
    }

    @Override
    public double doCalculations(BinaryOperator<Double> operation, double value1, double value2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doCalculations'");
    }

    @Override
    public void printDocument(String document) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printDocument'");
    }

    @Override
    public int getTaskCount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTaskCount'");
    }

    @Override
    public int getResourceCount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResourceCount'");
    }

    private Employee findEmployee(){
        int lowestValue = 1000000;
        List<Integer> work= new ArrayList<Integer>();
        List<Employee> tempEmp = new ArrayList<Employee>();
        employees.forEach(employee -> {
            work.add(employee.getTaskCount());
            tempEmp.add(employee);
            if (employee.getTaskCount()<lowestValue){
                lowestValue = employee.getTaskCount();
            }

        });
        return tempEmp.get(work.indexOf(lowestValue));
    }
    
}
