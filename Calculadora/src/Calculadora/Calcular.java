package Calculadora;

import Cola.Cola;
import NodoYPila.Pila;

public class Calcular {
    public boolean operador(String op){
        if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("^"))
            return true;
        else 
            return false;
    }
    
    public double operar(double a, double b, String caracter){
        double res=0.0;
        switch(caracter){
            case "+":
                return a+b;

            case "-":
                return a-b;

            case "*":
                return a*b;
                
            case "/":
                return a/b;
                
            case "^":
                return Math.pow(a, b);
            default:
                System.out.println("error");
        }
        
        
        
        return res;
    }
    
    public void calcular(String ecuacion){
        Pila lista = new Pila();
        System.out.println(ecuacion);
        String [] sim = ecuacion.split("\\|");
        
        for(int i = 0; i < sim.length; i++ ){
            if(!operador(sim[i])){
                lista.push(Double.parseDouble(sim[i]));
            }else{
                double a = (double)lista.pop().getDato();
                double b = (double)lista.pop().getDato();
               // lista.push(operar((double)lista.pop().getDato(), (double)lista.pop().getDato(), sim[i]));
                lista.push(operar(b, a, sim[i]));
            }
        }
        System.out.println("Respuesta es:"+lista.peek().getDato());
    }
}
