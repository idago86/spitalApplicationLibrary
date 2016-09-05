/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Mihaela Tudose
 */
public class Request implements java.io.Serializable{
    private int cod;
    public static final int REGISTER = 0;
    public static final int LOGIN = 1;

    public Request(int cod) {
        this.cod = cod;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
}
