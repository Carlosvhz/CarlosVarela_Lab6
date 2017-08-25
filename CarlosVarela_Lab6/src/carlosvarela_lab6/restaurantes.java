/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosvarela_lab6;

/**
 *
 * @author carlo
 */
public class restaurantes extends Lugar{
    
    private String categoria;
    private int calificacion;

    public restaurantes() {
        super();
    }

    public restaurantes(String categoria, int calificacion, String nombre, String direccion, int nivel_seguridad, carretera salida) {
        super(nombre, direccion, nivel_seguridad, salida);
        this.categoria = categoria;
        this.calificacion = calificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

}
