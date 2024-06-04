public class Defensa extends Futbolista{
    private int NumeroTackles;
    private int NumeroPenaltiesParticipacion;
    public Defensa(int iD, String nombre, String equipo, int numeroGoles, int numeroAutoGoles, int numeroPases,
            int numeroTackles, int numeroPenaltiesParticipacion) {
        super(iD, nombre, equipo, numeroGoles, numeroAutoGoles, numeroPases);
        NumeroTackles = numeroTackles;
        NumeroPenaltiesParticipacion = numeroPenaltiesParticipacion;
    }
    public int getNumeroTackles() {
        return NumeroTackles;
    }
    public void setNumeroTackles(int numeroTackles) {
        NumeroTackles = numeroTackles;
    }
    public int getNumeroPenaltiesParticipacion() {
        return NumeroPenaltiesParticipacion;
    }
    public void setNumeroPenaltiesParticipacion(int numeroPenaltiesParticipacion) {
        NumeroPenaltiesParticipacion = numeroPenaltiesParticipacion;
    }
    @Override
    public String toString() {
        return "ID=" + getID() + ", Nombre=" + getNombre() + ", Equipo=" + getEquipo() + ", NumeroGoles=" + getNumeroGoles()
                + ", NumeroAutoGoles=" + getNumeroAutoGoles() + ", NumeroPases=" + getNumeroPases();
    }  
}
