/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Challenge2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Nana", "Bob", "304-11-9246");
        Employee e2 = new Employee("Falsa", "Tim", "123-44-9215");
        Employee e3 = new Employee("Beleran", "Joe", "639-25-2256");
        
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(e1);
        employeesList.add(e2);
        employeesList.add(e3);
        
        
        for (Employee employ: employeesList){
            System.out.println(employ.getFirstName());
        }
        
        
        
    }
    
}
