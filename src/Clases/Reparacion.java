package Clases;

import java.math.BigDecimal;

public class Reparacion {

    private int idReparacion;
    private String tipoReparacion;
    private String observaciones;
    private BigDecimal precioReparacion;
    private String matricula;

    public Reparacion() {
    }

    public Reparacion(int idReparacion, String tipoReparacion, String observaciones, BigDecimal precioReparacion, String matricula) {
        this.idReparacion = idReparacion;
        this.tipoReparacion = tipoReparacion;
        this.observaciones = observaciones;
        this.precioReparacion = precioReparacion;
        this.matricula = matricula;
    }

    public int getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(int idReparacion) {
        this.idReparacion = idReparacion;
    }

    public String getTipoReparacion() {
        return tipoReparacion;
    }

    public void setTipoReparacion(String tipoReparacion) {
        this.tipoReparacion = tipoReparacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public BigDecimal getPrecioReparacion() {
        return precioReparacion;
    }

    public void setPrecioReparacion(BigDecimal precioReparacion) {
        this.precioReparacion = precioReparacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    

}
