/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repeatword;
import javax.swing.JOptionPane;


/**
 *
 * @author Miguel
 */
public class RepeatWord {

    public static void main(String[] args) {
        String word;
        int num;
        
        word = JOptionPane.showInputDialog("Escriba una palabra");
        num = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número de veces que quiere que se repita esta palabra"));
        
        for (int i=1; i<=num; i++){
            JOptionPane.showMessageDialog(null, word, i + ")", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
