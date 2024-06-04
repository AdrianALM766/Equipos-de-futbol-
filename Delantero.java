public class Delantero extends Futbolista {
    private int NumeroGolesPartido;
    private String posicion;
    
    public Delantero(int iD, String nombre, String equipo, int numeroGoles, int numeroAutoGoles, int numeroPases,
            int numeroGolesPartido, String posicion) {
        super(iD, nombre, equipo, numeroGoles, numeroAutoGoles, numeroPases);
        NumeroGolesPartido = numeroGolesPartido;
        this.posicion = posicion;
    }

    public int getNumeroGolesPartido() {
        return NumeroGolesPartido;
    }

    public void setNumeroGolesPartido(int numeroGolesPartido) {
        NumeroGolesPartido = numeroGolesPartido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion( String posicion) {
        this.posicion = posicion;
    }
    @Override
    public String toString() {
        return "ID=" + getID() + ", Nombre=" + getNombre() + ", Equipo=" + getEquipo() + ", NumeroGoles=" + getNumeroGoles()
                + ", NumeroAutoGoles=" + getNumeroAutoGoles() + ", NumeroPases=" + getNumeroPases() ;
    }  
}
