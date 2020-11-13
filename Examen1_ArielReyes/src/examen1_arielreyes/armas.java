/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_arielreyes;

/**
 *
 * @author Ariel
 */
public class armas {
    String tipo_arma; 
    int daño; 

    public armas() {

    }

    public armas(String tipo_arma, int daño) {
        this.tipo_arma = tipo_arma;
        this.daño = daño;
    }

    public String getTipo_arma() {
        return tipo_arma;
    }

    public void setTipo_arma(String tipo_arma) {
        this.tipo_arma = tipo_arma;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "armas{" + "tipo_arma=" + tipo_arma + ", daño=" + daño + '}';
    }


}
