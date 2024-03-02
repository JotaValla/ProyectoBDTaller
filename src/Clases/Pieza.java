
package Clases;


public class Pieza {
    private int ID, idReparacion;
    private String nombrePieza;

    public Pieza() {
    }

    public Pieza(int ID, int idReparacion, String nombrePieza) {
        this.ID = ID;
        this.idReparacion = idReparacion;
        this.nombrePieza = nombrePieza;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(int idReparacion) {
        this.idReparacion = idReparacion;
    }

    public String getNombrePieza() {
        return nombrePieza;
    }

    public void setNombrePieza(String nombrePieza) {
        this.nombrePieza = nombrePieza;
    }
    
    
}
