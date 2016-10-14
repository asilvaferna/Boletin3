package boletin3_1;

import javax.swing.JOptionPane;

public class Consumo {
    public double km, litros, vMed, pGas; //Declaramos los atributos y los encapsulamos
    //Metodos constructores que inicializa los valores de los atributos
    public Consumo(){
        km = 0; 
        litros = 0;
        vMed = 0;
        pGas = 0;
    }
    public Consumo(double kM, double lit, double vM, double pG){
        km = kM;
        litros = lit;
        vMed = vM;
        pGas = pG;
    }
    //Metodo para calcular el tiempo de viaje
    public double getTiempo(){
        return (km / vMed);
    }
    //Metodo para calcular el consumo medio
    public void consumoMedio(){
        JOptionPane.showMessageDialog(null, "El consumo medio es :  " + ((litros / km) * 100) + " l/100km " );
    }
    //Metodo para calcular el coste del consumo en euros
    public void consumoEuros(){
        JOptionPane.showMessageDialog(null, "El precio es :  " + (((litros / km) * 100) * pGas) + " €/100km " ); 
    }
    //Metodo que modifica el campo "km"
    public void setKMs (double klms){
        km = klms;
    }
    //Metodo que modifica el campo "litros"
    public void setLitros (double lit){
        litros = lit;
    }
    //Metodo que modifica el campo "vMed"
    public void setVMed (double vMedia){
        vMed = vMedia;
    }
    //Metodo que modifica el campo "pGas"
    public void setPGas (double pGa){
        pGas = pGa;
    }

}
