
package Clases;

import java.util.Date;


public class Vehiculo {
    
    private String matricula, modelo;
    private Date fechaCompra;

    public Vehiculo(String matricula, String modelo, Date fechaCompra) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }

    public Vehiculo(){
    
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    
    
    
}
