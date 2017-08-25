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
public class cancha extends Lugar{
    
    private String categoria;
    private boolean estado;

    public cancha() {
        super();
    }

    public cancha(String categoria, boolean estado, String nombre, String direccion, int nivel_seguridad, carretera salida) {
        super(nombre, direccion, nivel_seguridad, salida);
        this.categoria = categoria;
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

     @Override
    public String toString() {
        return super.getNombre();
    }
        
}
