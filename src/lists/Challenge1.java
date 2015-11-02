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
public class Challenge1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        
        List hobbiesList = new ArrayList();
        hobbiesList.add("Gaming");
        hobbiesList.add("Watching TV");
        hobbiesList.add("Coding");
        
        for (int i = 0; i < hobbiesList.size(); i++){
            System.out.println(hobbiesList.get(i).toString());
        }
        
        System.out.println("");
        System.out.println("NOW ADDING ITEMS");
        System.out.println("");

        hobbiesList.add("Naps");
        hobbiesList.add("More Games");
        
        for (int i = 0; i < hobbiesList.size(); i++){
            System.out.println(hobbiesList.get(i).toString());
        }
        
        
        System.out.println("");
        System.out.println("NOW REMOVING ITEMS");
        System.out.println("");

        hobbiesList.remove("Watching TV");
        hobbiesList.remove("More Games");
        
        for (int i = 0; i < hobbiesList.size(); i++){
            System.out.println(hobbiesList.get(i).toString());
        }
        
        
        
        
    }
}
