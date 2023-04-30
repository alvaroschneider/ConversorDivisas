/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversor;

/**
 *
 * @author alvaro
 */

import javax.swing.*;

public class Conversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hola mundo!");
        //Ventana v = new Ventana();
        //v.setVisible(true);
        //v.setLocationRelativeTo(null);
        
        int dolar = 466;
        String pesos = "0";
        int dolares = 0;
        String opcionElegida;
               
        String [] opciones = {"I adore turtles", "Yes", "Maybe", "Urm...", "No", "Hate them"};

        
        opcionElegida = (String) JOptionPane.showInputDialog(null, "Elija una opción:", "Conversor de divisas", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[2]);
        
        pesos = JOptionPane.showInputDialog("Indroduzca pesos a convertir");
        dolares = Integer.parseInt(pesos) / dolar;
        
        JOptionPane.showMessageDialog(null, "Dolares"+dolares);
        
    }

}
