/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculatorjava;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class CalculatorJava {

    public static void main(String[] args) {
        
        /*
            NOTA!!!
            Ya había trabajado en esta calculadora para practicar así que este código usaré para la guía...
        */
        int i = 0, j = 0;
        float num1, num2, result = 0;
        String operacion;
        
        do {
            num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer número"));
            operacion = JOptionPane.showInputDialog("Escriba la operacion que desea hacer '+, -, *, /'");
            if ("+".equals(operacion) || "-".equals(operacion) || "*".equals(operacion) || "/".equals(operacion)){
                num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo número"));
                if ("/".equals(operacion)){
                    if (num2 == 0){
                        do {
                            JOptionPane.showMessageDialog(null, "El divisor no puede ser 0 porque es indeterminado...");
                            num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese otro número diferente de 0"));
                            if (num2 != 0){
                                j ++;
                            }
                        }
                        while (j == 0);
                    }
                }
                switch (operacion) {
                    case "+" -> result = num1 + num2;
                    case "-" -> result = num1 - num2;
                    case "*" -> result = num1 * num2;
                    case "/" -> result = num1 / num2;
                }
                JOptionPane.showMessageDialog(null, "El resultado de " + num1 + operacion + num2 + " es: " + result);
                i = Integer.parseInt(JOptionPane.showInputDialog("Presione cualquier número si desea salir y 0 si quiere realizar otra operación"));
            }
            else JOptionPane.showMessageDialog(null, "Operación inválida");
        }
        while (i == 0);
    }
}
