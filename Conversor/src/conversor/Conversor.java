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

        /*
        dolar = 222,64
        euro = 245,25
        libra = 279,75
        yen = 1,63
        won = 0,16        
         */
        double dolar = 222.64;
        double euro = 245.25;
        double libra = 279.75;
        double yen = 1.63;
        double won = 0.16;
        String valorConvertir = "0";
        String opcionElegida;
        double salida;

        String[] opciones = {"Pesos a Dolar", "Pesos a Euro", "Pesos a Libra", "Pesos a Yen", "Pesos a Won", "Dolar a Pesos", "Euro a Pesos", "Libra a Pesos", "Yen a Pesos", "Won a Pesos"};

        opcionElegida = (String) JOptionPane.showInputDialog(null, "Elija una opción:", "Conversor de divisas", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        valorConvertir = JOptionPane.showInputDialog("Indroduzca cantidad a convertir");
        //dolares = Integer.parseInt(pesos) / dolar;

        switch (opcionElegida) {
            case "Pesos a Dolar":
                salida = Double.parseDouble(valorConvertir) / dolar;
                break;
            case "Pesos a Euro":
                salida = Double.parseDouble(valorConvertir) / euro;
                break;
            case "Pesos a Libra":
                salida = Double.parseDouble(valorConvertir) / libra;
                break;
            case "Pesos a Yen":
                salida = Double.parseDouble(valorConvertir) / yen;
                break;
            case "Pesos a Won":
                salida = Double.parseDouble(valorConvertir) / won;
                break;
            case "Dolar a Pesos":
                salida = Double.parseDouble(valorConvertir) * dolar;
                break;
            case "Euro a Pesos":
                salida = Double.parseDouble(valorConvertir) * euro;
                break;
            case "Libra a Pesos":
                salida = Double.parseDouble(valorConvertir) * libra;
                break;
            case "Yen a Pesos":
                salida = Double.parseDouble(valorConvertir) * yen;
                break;
            case "Won a Pesos":
                salida = Double.parseDouble(valorConvertir) * won;
                break;
            default:
                salida = 0;
        }
        JOptionPane.showMessageDialog(null, "Divisa convertida: " + salida);
    }

}
