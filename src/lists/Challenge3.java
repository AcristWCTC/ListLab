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
public class Challenge3 {
    public static void main(String[] args) {
        
    
        Employee e1 = new Employee("Nana", "Bob", "304-11-9246");
        Dog d1 = new Dog("Falsa", 123449215);
        Employee e2 = new Employee("Beleran", "Joe", "639-25-2256");
        Dog d2 = new Dog("Bolas", 669257813);
        
        List mixedList = new ArrayList();
        mixedList.add(e1);
        mixedList.add(d1);
        mixedList.add(e2);
        mixedList.add(d2);
        
        
        for (Object obj : mixedList) {
            if (obj instanceof Employee){
                Employee e = (Employee)obj;
                System.out.println(e);
            } else if (obj instanceof Dog) {
                Dog d = (Dog)obj;
                System.out.println(d);
            }
            System.out.println("--------------------------");
        }
    }
        
    
}
