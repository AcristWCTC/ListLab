/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Adam
 */
public class Challenge4 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Nana", "Bob", "304-11-9246");
        Employee e2 = new Employee("Falsa", "Tim", "123-44-9215");
        Employee e3 = new Employee("Beleran", "Joe", "304-11-9246");
        Employee e4 = new Employee("Bolas", "Susie", "669-25-7813");
        
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        
                
        for (Employee employ: employeeList){
            System.out.println(employ.getFirstName() + " " + employ.getSsn());
        }
        
        Set<Employee> employeeSet = new LinkedHashSet<>(employeeList);
        
        employeeList = new ArrayList<>(employeeSet);

        
        System.out.println("\nDisplaying list after use of set...");
        for (Employee employ: employeeList){
            System.out.println(employ.getFirstName() + " " + employ.getSsn());
        }
        
        
        

        
        
        
    }
    
}
