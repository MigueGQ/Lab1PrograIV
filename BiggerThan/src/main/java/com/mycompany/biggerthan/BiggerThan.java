/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biggerthan;
import javax.swing.JOptionPane;


/**
 *
 * @author Miguel
 */
public class BiggerThan {

    public static void main(String[] args) {
        int num1, num2, num3, bigger;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el primer número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el segundo número"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el tercer número"));
        
        if (num1 > num2 && num1 > num3){
            bigger = num1;
        }
        else if(num2 > num1 && num2 > num3){
            bigger = num2;
        }
        else bigger = num3;
        
        if (num1 == num2 && num1 == num3){
            JOptionPane.showMessageDialog(null, "Todos son iguales", "Comparando " + num1 + ", " + num2 + ", " + "y " +num3, JOptionPane.PLAIN_MESSAGE);
        }
        else JOptionPane.showMessageDialog(null, "El número mayor es: " + bigger, "Comparando " + num1 + ", " + num2 + ", " + "y " +num3, JOptionPane.PLAIN_MESSAGE);
        
    }
}
