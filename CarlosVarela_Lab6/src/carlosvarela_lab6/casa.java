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
public class casa extends Lugar{

    public casa() {
    }

    public casa(String nombre, String direccion, int nivel_seguridad, carretera salida) {
        super(nombre, direccion, nivel_seguridad, salida);
    }

    public casa(String nombre, String direccion, int nivel_seguridadd) {
        super(nombre, direccion, nivel_seguridadd);
    }
    
     @Override
    public String toString() {
        return super.getNombre();
    }
}
