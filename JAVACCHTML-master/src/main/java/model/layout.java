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
public class layout extends elementoSintactico {

    private row row;
    private int rows;
    private int cols;

    public layout(row row, int rows, int cols) {
        this.row = row;
        this.rows = rows;
        this.cols = cols;
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
