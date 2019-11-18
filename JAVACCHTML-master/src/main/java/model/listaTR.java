/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Mauricio
 */
public class listaTR extends elementoSintactico{

    private List<listaTD> listaTDs;
    private String identificador;

    public listaTR(List<listaTD> listaTDs, String identificador) {
        this.listaTDs = listaTDs;
        this.identificador = identificador;
    }

    public listaTR(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
