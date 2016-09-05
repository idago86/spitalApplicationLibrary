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
public class Response implements java.io.Serializable{
    private int cod;
    public static final int REGISTER_OK = 0; 
    public static final int REGISTER_FAILED = 1; 

    public Response(int cod) {
        this.cod = cod;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
}
