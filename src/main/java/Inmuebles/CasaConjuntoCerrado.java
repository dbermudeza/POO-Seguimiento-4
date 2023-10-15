package Inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana {
    protected static double valorArea = 2500000;

    protected int valorAdministración;

    protected boolean tienePiscina;

    protected boolean tieneCamposDeportivos;
    public CasaConjuntoCerrado(int identificadorInmobiliario, int area,
    String direccion, int numeroHabitaciones, int numeroBaños,
    int numeroPisos, int valorAdministracion, boolean tienePiscina,
    boolean tieneCamposDeportivos) {
    super(identificadorInmobiliario, area, direccion,
    numeroHabitaciones, numeroBaños, numeroPisos);
    this.valorAdministración = valorAdministracion;
    this.tienePiscina = tienePiscina;
    this.tieneCamposDeportivos = tieneCamposDeportivos;   
    }
}