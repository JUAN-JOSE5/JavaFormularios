/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author CBN
 */
public class IMC {

    public IMC (){
        
    }
    public double resultadoIMC(double peso,double estatura){
        
            double resultado = peso/Math.pow(estatura,2);
            return resultado;
    }
    public String obsIMC(double imc){
        String diagnostico="";
        if(imc <15){
            diagnostico ="Delgadez muy severa";
        }else if(imc<=15.9){
            diagnostico="Delgadez severa";
        }else if(imc<=18.4){
            diagnostico="Delgadez";
        }else if(imc<=24.9){
            diagnostico="Peso saludable";
        }else if(imc<30){
            diagnostico="Sobrepeso";
        }else if(imc<40){
            diagnostico="Obesidad severa";
        }else {
            diagnostico="Obesidad morbida";
        }
        return diagnostico;
      
    }
    
}