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
public class MedicDTO implements java.io.Serializable{
    private int id;
    private String nume, matricula; 

    public MedicDTO() {
    }

    public MedicDTO(String nume, String matricula) {
        this.nume = nume;
        this.matricula = matricula;
    }

    public MedicDTO(int id, String nume, String matricula) {
        this.id = id;
        this.nume = nume;
        this.matricula = matricula;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Doctor : " + nume.toUpperCase() + ", Matricula : " + matricula ;
    }
    
    
}
