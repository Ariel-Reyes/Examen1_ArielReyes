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
public class campistas extends Personas {
 
    String tipo_campista;
    String estado_vida;

    public campistas() {
        super();
    }

    public campistas(String tipo_campista, String estado_vida, String nombre, int edad, String sexo, armas arma) {
        super(nombre, edad, sexo, arma);
        this.tipo_campista = tipo_campista;
        this.estado_vida = estado_vida;
    }

    public String getTipo_campista() {
        return tipo_campista;
    }

    public void setTipo_campista(String tipo_campista) {
        this.tipo_campista = tipo_campista;
    }

    public String getEstado_vida() {
        return estado_vida;
    }

    public void setEstado_vida(String estado_vida) {
        this.estado_vida = estado_vida;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
