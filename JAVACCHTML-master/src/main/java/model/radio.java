/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mauricio
 */
public class radio extends elementoSintactico {

    private String id;
    private String name;
    private String identificador;

    public radio(String id, String name, String identificador) {
        this.id = id;
        this.name = name;
        this.identificador = identificador;
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
