package oving6.delegation.office;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Printer {

    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private ArrayList<String> prints = new ArrayList<String>();

    public static void main(String[] args) {
        // Printer print1 = new Printer();
        // Employee clk1 = new Clerk(print1);
        // Employee clk2 = new Clerk(print1);
        // print1.printDocument("testetest", clk1);
        // print1.printDocument("testeteste", clk1);
        // print1.printDocument("bers", clk2);
        // System.out.println(print1.getPrintHistory(clk2)); 
    }
    // Trenger system for å lagre printene til hver employee som har printet noe
    // Kan vi tilegene hver employee en ID ja??
    void printDocument(String document, Employee employee){
        if (employees.contains(employee)){
            int currIndex = employees.indexOf(employee);
            String prevHist = prints.get(currIndex);
            prevHist += "END of Document START OF NEW DOC"+ document; //Her finnes noe bedre
            prints.set(currIndex,prevHist);
        } else{
            employees.add(employee);
            prints.add(document);
        }
        System.out.println(document);
    }

    List<String> getPrintHistory(Employee employee){
        if(!employees.contains(employee)){
            List<String> retval = new ArrayList<String>();
            return retval;
        }
        String orgString = prints.get(employees.indexOf(employee));
        List<String> returnStr = Arrays.asList(orgString.split("END of Document START OF NEW DOC"));
        List<String> correctRetStr = new ArrayList<String>(returnStr);
        return correctRetStr;
    }
}
