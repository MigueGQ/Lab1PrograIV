/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.namelastnamedate;
import javax.swing.JOptionPane;
import java.util.*;


/**
 *
 * @author Miguel
 */
public class NameLastNameDate {

    public static void main(String[] args) {
        String name, lastName;
        name = JOptionPane.showInputDialog("Ingrese su nombre");
        lastName = JOptionPane.showInputDialog("Ingrese su apellido");
        
        JOptionPane.showMessageDialog(null, "Buenos días estimado usuario su nombres es: " + name + " " + lastName + " y la fecha de hoy es: " + new Date(), "Nombre, Apellido y Fecha", JOptionPane.PLAIN_MESSAGE);
    }
}
