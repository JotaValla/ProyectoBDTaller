
package Clases;

import java.util.Date;


public class Empleado {
    private String cedula, nombre, direccion;
    private double salario;
    private Date fechaContrato;

    public Empleado(String cedula, String nombre, String direccion, double salario, Date fechaContrato) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.salario = salario;
        this.fechaContrato = fechaContrato;
    }

    public Empleado() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
    
    
    
}
