package oving6.delegation.office;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Manager implements Employee {
    private Collection<Employee> employees;
    private int taskCount;
    private int resourceCount = 1;

    //Main DEL 3 og DEL 2 på hele oppgaven
    public static void main(String[] args) {
        Printer pr1 = new Printer();
        Clerk clk1 = new Clerk(pr1);
        Clerk clk2 = new Clerk(pr1);
        Manager mng1 = new Manager(Arrays.asList(clk1,clk2));
        Clerk clk3 = new Clerk(pr1);
        Manager CEO = new Manager(Arrays.asList(clk3,mng1));
        System.out.println(CEO.getResourceCount());

        }
    //Constructor
    public Manager(Collection<Employee> employees){
        if (employees.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.employees = employees;

        this.employees.stream().forEach(emp->{
            this.resourceCount +=emp.getResourceCount();
        });

    }

    //Private Methods
    private Employee findEmployee(){
        List<Integer> curEmployees = employees.stream().map(employee -> employee.getTaskCount()).collect(Collectors.toList()); 
        int index = curEmployees.indexOf(Collections.min(curEmployees));
        List<Employee> retList = new ArrayList<Employee>(employees);
        
        return retList.get(index);
    }


    // public
    @Override
    public double doCalculations(BinaryOperator<Double> operation, double value1, double value2) {
        taskCount++;
        return findEmployee().doCalculations(operation, value1, value2);
    }


    @Override
    public void printDocument(String document) {
        taskCount++;
        findEmployee().printDocument(document);
    }

    @Override
    public int getTaskCount() {
        return taskCount;
    }

    @Override
    public int getResourceCount() {
        return resourceCount;
    }
}
