/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mauricio
 */
public class radiobuttom extends elementoSintactico {

    private List<radio> listaRadios;

    public radiobuttom(List<radio> listaRadios) {
        this.listaRadios = new ArrayList<>();
        this.listaRadios = listaRadios;
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
