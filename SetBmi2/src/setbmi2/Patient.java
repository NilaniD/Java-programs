/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setbmi2;

/**
 *
 * @author USER
 */
public class Patient {
    String name;
   double height;
   double weight;
   double bmi;
   
   
   public void CalculateBmi(){
    bmi=weight/(height*height);
    bmi = Math.round(bmi * 100.0) / 100.0;
    System.out.println(name + "'s BMI is " + bmi + " kg/m2.");
}
   
}


