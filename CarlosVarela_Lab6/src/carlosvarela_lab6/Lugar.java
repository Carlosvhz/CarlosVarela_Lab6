/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosvarela_lab6;

import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class Lugar {
    
    private String nombre, direccion;
    private int nivel_seguridad;
    private ArrayList<carretera> entradas = new ArrayList();
    private carretera salida;

    public Lugar() {
    }

    public Lugar(String nombre, String direccion, int nivel_seguridad, carretera salida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nivel_seguridad = nivel_seguridad;
        this.salida = salida;
    }

    public Lugar(String nombre, String direccion, int nivel_seguridadd) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nivel_seguridad = nivel_seguridadd;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNivel_seguridad() {
        return nivel_seguridad;
    }

    public void setNivel_seguridad(int nivel_seguridad) {
        this.nivel_seguridad = nivel_seguridad;
    }

    public ArrayList<carretera> getEntradas() {
        return entradas;
    }

    public void setEntradas(carretera entrada) {
        this.entradas.add(entrada);
    }

    public carretera getSalida() {
        return salida;
    }

    public void setSalida(carretera salida) {
        this.salida = salida;
    }
    
    
}
