/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmiarray2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class BmiArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPt;

        System.out.print("How many patients are there to calculate BMI? ");
        numberOfPt = scanner.nextInt();

        Patient[] listPatients;

        listPatients = new Patient[numberOfPt];

        for (int i = 0; i < listPatients.length; i++) {
            Patient p = new Patient();
            System.out.print("Enter patient's name: ");
            p.name = scanner.next();
            System.out.print("Enter patient's height: ");
            p.height = scanner.nextDouble();
            System.out.print("Enter patient's weight: ");
            p.weight = scanner.nextDouble();
            p.calculateBmi();
            listPatients[i] = p;

            System.out.println("Patient " + p.name + "'s BMI is " + p.bmi + " kg/m2.");
            System.out.println("");
        }

        Patient max;
        Patient min;
        max = listPatients[0];
        min = listPatients[0];

        for (Patient p : listPatients) {                    
            if (p.bmi > max.bmi) {
                max = p;
            }
            if (p.bmi < min.bmi) {
                min = p;
            }
        }

        System.out.println("");
        System.out.println(max.name + " is having the highest BMI of " + max.bmi + ".");
        System.out.println("");
        System.out.println(min.name + " is having the lowest BMI of " + min.bmi + ".");

    }

}
