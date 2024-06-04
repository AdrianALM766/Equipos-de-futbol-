

public class Arquero  extends Futbolista{
    private int GolesTapados;
    private int NumeroPenaltisTapados;
    
    public Arquero(int iD, String nombre, String equipo, int numeroGoles, int numeroAutoGoles, int numeroPases,
            int golesTapados, int numeroPenaltisTapados) {
        super(iD, nombre, equipo, numeroGoles, numeroAutoGoles, numeroPases);
        GolesTapados = golesTapados;
        NumeroPenaltisTapados = numeroPenaltisTapados;
    }

    public int getGolesTapados() {
        return GolesTapados;
    }

    public void setGolesTapados(int golesTapados) {
        GolesTapados = golesTapados;
    }

    public int getNumeroPenaltisTapados() {
        return NumeroPenaltisTapados;
    }

    public void setNumeroPenaltisTapados(int numeroPenaltisTapados) {
        NumeroPenaltisTapados = numeroPenaltisTapados;
    }
    
    @Override
    public String toString() {
        return "ID=" + getID() + ", Nombre=" + getNombre() + ", Equipo=" + getEquipo() + ", NumeroGoles=" + getNumeroGoles()
                + ", NumeroAutoGoles=" + getNumeroAutoGoles() + ", NumeroPases=" + getNumeroPases();
    }    
}
