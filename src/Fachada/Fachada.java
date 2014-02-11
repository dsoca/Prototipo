/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import prototipo.Utilitario.Utilitario;

/**
 *
 * @author Deibys
 */
public class Fachada {
    private Servicios Serv = new Servicios();

    public boolean procesaEgresoManual(String parametro) {        
        return Serv.procesaEgresoManual(parametro);
    }
}
