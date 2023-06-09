package conversor;

import javax.swing.*;

public class Conversor {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hola mundo!");

        int ventanaYesNo = 0;

        do {
            convertir();
            ventanaYesNo = JOptionPane.showConfirmDialog(null, "¿Quieres salir del programa?", "Conversor", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        } while (ventanaYesNo == 1);
        
        JOptionPane.showMessageDialog(null, "Hasta la próxima!");
    }

    public static void convertir() {
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
        String moneda = " ";

        String[] opciones = {"Pesos a Dolar", "Pesos a Euro", "Pesos a Libra", "Pesos a Yen", "Pesos a Won", "Dolar a Pesos", "Euro a Pesos", "Libra a Pesos", "Yen a Pesos", "Won a Pesos"};

        opcionElegida = (String) JOptionPane.showInputDialog(null, "Elija una opción:", "Conversor de divisas", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        valorConvertir = JOptionPane.showInputDialog("Indroduzca cantidad a convertir");
        //dolares = Integer.parseInt(pesos) / dolar;

        switch (opcionElegida) {
            case "Pesos a Dolar":
                salida = Double.parseDouble(valorConvertir) / dolar;
                moneda = "dolares";
                break;
            case "Pesos a Euro":
                salida = Double.parseDouble(valorConvertir) / euro;
                moneda = "euros";
                break;
            case "Pesos a Libra":
                salida = Double.parseDouble(valorConvertir) / libra;
                moneda = "libras";
                break;
            case "Pesos a Yen":
                salida = Double.parseDouble(valorConvertir) / yen;
                moneda = "yenes";
                break;
            case "Pesos a Won":
                salida = Double.parseDouble(valorConvertir) / won;
                moneda = "wones";
                break;
            case "Dolar a Pesos":
                salida = Double.parseDouble(valorConvertir) * dolar;
                moneda = "pesos";
                break;
            case "Euro a Pesos":
                salida = Double.parseDouble(valorConvertir) * euro;
                moneda = "pesos";
                break;
            case "Libra a Pesos":
                salida = Double.parseDouble(valorConvertir) * libra;
                moneda = "pesos";
                break;
            case "Yen a Pesos":
                salida = Double.parseDouble(valorConvertir) * yen;
                moneda = "pesos";
                break;
            case "Won a Pesos":
                salida = Double.parseDouble(valorConvertir) * won;
                moneda = "pesos";
                break;
            default:
                salida = 0;
        }
        JOptionPane.showMessageDialog(null, "Divisa convertida: " + salida + " " + moneda);
    }

}
