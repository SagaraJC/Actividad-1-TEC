/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

/**
 *
 * @author WM Miramontes
 */
public class automovil {
    private String marca;
    private String submarca;
    private int anio;
    private String transmision;
    private int kilometraje;

    public automovil(String marca, String submarca, int anio, String transmision, int kilometraje) {
        this.marca = marca;
        this.submarca = submarca;
        this.anio = anio;
        this.transmision = transmision;
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "automovil{" + "marca: " + marca + ", submarca: " + submarca + ", año: " + anio + ", transmision tipo: " + transmision + ", kilometraje: " + kilometraje + '}';
    }
    
    
    
    public void avanzar(){
        System.out.println("Se está avanzando");
    }
    
    public void frenar(){
        System.out.println("No hay frenos...");
    }
    
    
    
}
