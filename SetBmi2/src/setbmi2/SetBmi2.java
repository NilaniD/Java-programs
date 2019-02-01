/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setbmi2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author USER
 */
public class SetBmi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set patients = new HashSet();

        for (int i = 0; i == patients.size(); i++) 
        {
            System.out.println("");
            System.out.print("Do you want to add a new patient?(Y/N) : ");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.next();
            
            if (response.equalsIgnoreCase("Y")) 
            {
                System.out.println("");
                Patient p = new Patient();
                patients.add(p);
                System.out.print("Name: ");
                p.name = scanner.next();
                System.out.print("Height: ");
                p.height = scanner.nextDouble();
                System.out.print("Weight: ");
                p.weight = scanner.nextDouble();
                p.CalculateBmi();

            } 
            else if (response.equalsIgnoreCase("N")) 
            {
                System.out.println("");
                System.out.println("Thank you! Have a good day!");
            } 
            else 
            {
                System.out.println("");
                System.out.println("Invalid entry");
            }

        }
        System.out.println("Total number of patients is " + patients.size());
    }
}
