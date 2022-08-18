package Introduccion;

//Ejercicio #2 de la Guia de estudio

import javax.swing.JOptionPane;

public class Introduccion {
    public static void main(String[] args) {
        
        double pi = 3.1416, radio, resultado;
        String radioString;
        
        radioString = JOptionPane.showInputDialog("Ingrese el radio a calcular");
        radio = Double.parseDouble(radioString);
        
        if(radio >= 0){
            resultado = (pi * (radio*radio));
            JOptionPane.showMessageDialog(null, "El area del circulo es: " + resultado);
        }else{
            JOptionPane.showMessageDialog(null, "Error. El numero ingresado es invalido, por favor ingresar un numero mayor a cero");
        }
            
    }
    
}
