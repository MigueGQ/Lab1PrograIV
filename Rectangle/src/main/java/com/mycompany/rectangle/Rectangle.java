/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangle;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Rectangle {

    public static void main(String[] args) {
        float a, b, area, perimeter;
        a = Float.parseFloat(JOptionPane.showInputDialog("Escriba el valor de la de la altura"));
        b = Float.parseFloat(JOptionPane.showInputDialog("Escriba el valor de la base"));
        
        area = b * a;
        perimeter = (2*a) + (2*b);
        
        JOptionPane.showMessageDialog(null, "El valor de la área es de: " + area + ", el valor del perímetro es de: " + perimeter, "Calculando A Y P del rectángulo (a=" + a + " y b=" + b + ")", JOptionPane.PLAIN_MESSAGE);
    }
}
