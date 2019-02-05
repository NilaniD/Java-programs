/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulaionex1;

/**
 *
 * @author USER
 */
public class Patient {
    private String name;
    private Double height;
    private Double weight;
    private Double bmi;
    private String msg;
    
 public void calculateBmi(){
     bmi=Math.round(weight/(height*height)*100.0)/100.0;
     
 }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(Double height) {
        
        if(height>2.5){
            msg+="Height is unacceptably high"+"\n";            
        }if(height<0.3){
            msg+="Height is unaccaptably low"+"\n";
        }
        this.height = height;
    }

    public void setWeight(Double weight) {
        msg="";
        if(weight>200){
            msg+="Weight is unacceptably high"+"\n";            
        }if(weight<5){
            msg+="Weight is unaccaptably low"+"\n";
        }
        this.weight = weight;
    }

    public Double getBmi() {
        return bmi;
    }

    public String getMsg() {
        return msg;
    }
    
    public void categorizeBmi(){
        if(bmi>30){
            msg+="You are obese";
        }else if(bmi>24){
            msg+="You are overweight";
        }else if(bmi<18){
            msg+="You are underweight";
        }else{
            msg+="Your bmi is within normal range";
        }
            
    }
 
 
    
}
