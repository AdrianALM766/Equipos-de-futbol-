

public class Futbolista {
    private int ID;
    private String Nombre;
    private String Equipo;
    private int NumeroGoles;
    private int NumeroAutoGoles;
    private int NumeroPases;

    public Futbolista(int iD, String nombre, String equipo, int numeroGoles, int numeroAutoGoles, int numeroPases) {
        ID = iD;
        Nombre = nombre;
        Equipo = equipo;
        NumeroGoles = numeroGoles;
        NumeroAutoGoles = numeroAutoGoles;
        NumeroPases = numeroPases;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String equipo) {
        Equipo = equipo;
    }

    public int getNumeroGoles() {
        return NumeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        NumeroGoles = numeroGoles;
    }

    public int getNumeroAutoGoles() {
        return NumeroAutoGoles;
    }

    public void setNumeroAutoGoles(int numeroAutoGoles) {
        NumeroAutoGoles = numeroAutoGoles;
    }

    public int getNumeroPases() {
        return NumeroPases;
    }

    public void setNumeroPases(int numeroPases) {
        NumeroPases = numeroPases;
    }



}
