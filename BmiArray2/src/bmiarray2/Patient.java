/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmiarray2;

/**
 *
 * @author USER
 */
public class Patient {
    String name;
    Double height;
    Double weight;
    Double bmi;
    
    public void calculateBmi() {
       bmi=weight/(height*height);
    }
    
}


