package model;

import javax.swing.JOptionPane;

/**
 * datos2
 */
public class datos2 {

    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Digita una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digita una entero: "));
        letra = JOptionPane.showInputDialog("Digita una caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digita una decimal: "));

        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "El Entero es: "+entero);
        JOptionPane.showMessageDialog(null, "El caracter es: "+letra);
        JOptionPane.showMessageDialog(null, "La decimal es: "+decimal);
    }
}