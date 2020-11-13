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
public class Personas {

    String nombre;
    int edad;
    String sexo;
 armas arma ; 
    public Personas() {
    }

    public Personas(String nombre, int edad, String sexo, armas arma) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.arma = arma;
    }

    
    public String getNombre() {
        return nombre;
    }

    public armas getArma() {
        return arma;
    }

    public void setArma(armas arma) {
        this.arma = arma;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }

}
