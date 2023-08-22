/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circumference;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Circumference {

    public static void main(String[] args) {
        double r, area, volume;
        r = Double.parseDouble(JOptionPane.showInputDialog("Escriba el valor del radio de la circunferencia"));
         /*Area = PI*r^2 */
        area = Math.PI * Math.pow(r, 2);
        /*Volumen = 3/4*PI*r^3 */
        volume = (Math.PI * Math.pow(r, 3)) * 3/4;
        JOptionPane.showMessageDialog(null, "El área de la circunferencia es de " + area + "\nEl volumen es de: " + volume, "r=" + r, JOptionPane.PLAIN_MESSAGE);
    }
}
