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

    ArrayList<Personas> victamas = new ArrayList();

    public elsheison() {
        super();
    }

    public elsheison(String nombre, int edad, String sexo, armas arma, ArrayList<Personas> victamas) {
        super(nombre, edad, sexo, arma);
        this.victamas = victamas;
    }

    public ArrayList<Personas> getVictamas() {
        return victamas;
    }

    public void setVictamas(ArrayList<Personas> victamas) {
        this.victamas = victamas;
    }

    @Override
    public String toString() {
        return "elsheison{" + "victamas=" + victamas + '}';
    }

}
