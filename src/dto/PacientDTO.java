/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Israel Dago
 */
public class PacientDTO implements java.io.Serializable{
    private int id;
    private String nume, cnp;

    public PacientDTO() {
    }

    public PacientDTO(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public PacientDTO(int id, String nume, String cnp) {
        this.id = id;
        this.nume = nume;
        this.cnp = cnp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Pacient : " +nume.toUpperCase();
    }
    
    
    
    
}
