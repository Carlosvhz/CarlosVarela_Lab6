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
public class carretera {
    
    private int numero_unico, distancia;
    private Lugar inicio, fin;

    public carretera() {
    }

    public carretera(int numero_unico, int distancia, Lugar inicio, Lugar fin) {
        this.numero_unico = numero_unico;
        this.distancia = distancia;
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getNumero_unico() {
        return numero_unico;
    }

    public void setNumero_unico(int numero_unico) {
        this.numero_unico = numero_unico;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Lugar getInicio() {
        return inicio;
    }

    public void setInicio(Lugar inicio) {
        this.inicio = inicio;
    }

    public Lugar getFin() {
        return fin;
    }

    public void setFin(Lugar fin) {
        this.fin = fin;
    }
    
    
}
