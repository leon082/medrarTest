/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medrartest.cine.model;

/**
 *
 * @author luis.leon
 */
public class Chair {
    
    private String column;
    private String row;
    private boolean state;

    public Chair(String column, String row,boolean state) {
        this.column = column;
        this.row = row;
        this.state=state;
    }
    
    

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    
    
    
    
    
    
    
    
}
