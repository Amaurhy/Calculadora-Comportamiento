package Calculadora;

/**
 *
 * @author Francisco Ignacio Núñez Valdivieso
 */
public class Main {
    public static void main(String [ ] args){
    Posfijo ecuacion = new Posfijo();
    Calcular resultado = new Calcular();
    
    String cadena ="(30-6)/3-(4*2)";
    
    cadena = ecuacion.conv_posfija(cadena);
    resultado.calcular(cadena);
    }
}
