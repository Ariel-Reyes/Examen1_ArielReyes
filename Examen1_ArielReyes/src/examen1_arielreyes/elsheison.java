/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_arielreyes;

import java.util.ArrayList;

/**
 *
 * @author Ariel
 */
public class elsheison extends Personas {

    int personas;

    public elsheison() {
        super();

    }

    public elsheison(int personas, String nombre, int edad, String sexo, armas arma) {
        super(nombre, edad, sexo, arma);
        this.personas = personas;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
