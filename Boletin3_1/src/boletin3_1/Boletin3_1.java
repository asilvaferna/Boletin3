package boletin3_1;

import javax.swing.JOptionPane;

public class Boletin3_1 {

    public static void main(String[] args) {
        Consumo com1 = new Consumo(); //Creamos un objeto de tipo "Consumo" sin parametros
        com1.setLitros(Double.parseDouble(JOptionPane.showInputDialog("Litros "))); //Modificamos el campo "Litros" para el objeto "com1"
        com1.setPGas(Double.parseDouble(JOptionPane.showInputDialog("Precio gasolina "))); //Modificamos el campo "Precio gasolina" para el objeto "com1"
        //Creamos un objeto de tipo "Consumo" con parametros
        Consumo com2 = new Consumo(Double.parseDouble(JOptionPane.showInputDialog("Km ")),Double.parseDouble(JOptionPane.showInputDialog("Litros ")), Double.parseDouble(JOptionPane.showInputDialog("Velocidad Media")),Double.parseDouble(JOptionPane.showInputDialog("Precio gasolina ")));
        com2.consumoMedio(); //Visualizamos el valor "Consumo medio" del objeto "com2"
        com2.setLitros(Double.parseDouble(JOptionPane.showInputDialog("Litros "))); //Modificamos el valor del campo "Litros" para el objeto "com2"
        JOptionPane.showMessageDialog(null, "La velocidad media es : " + com2.vMed); //Visualizamos por pantalla el valor de vMed para el objeto "com2"
    }
    
}
