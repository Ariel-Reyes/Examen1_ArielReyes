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
public class estado_vida {
    
    String tipo; 

    public estado_vida(String tipo) {
        this.tipo = tipo;
    }

    public estado_vida() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }

}
