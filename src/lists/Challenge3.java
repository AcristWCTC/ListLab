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
        
    
        Employee o1 = new Employee("Nana", "Bob", "304-11-9246");
        Dog o2 = new Dog("Falsa", 123449215);
        Employee o3 = new Employee("Beleran", "Joe", "639-25-2256");
        Dog o4 = new Dog("Bolas", 669257813);
        
        List mixedList = new ArrayList();
        mixedList.add(o1);
        mixedList.add(o2);
        mixedList.add(o3);
        mixedList.add(o4);
        
        
        for (int i = 0; i<mixedList.size(); i++){
            System.out.println(mixedList.get(i).toString());
        }
    }
        
    
}
