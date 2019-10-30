package exemploordenador;

/**
 * @author dcancelas
 */
public class Ordenador {
    
    private Rato rato = new Rato();
    private Pantalla pantalla = new Pantalla();
    private Cpu procesador = new Cpu();

    /**
     * Constructor sin parámetros.
     */
    public Ordenador() {

    }
    /**
     * Constructor con parámetros.
     * @param rato El parámetro rato define las características del ratón.
     * @param pantalla El parámetro pantalla define las características de la pantalla.
     * @param procesador El parámetro procesador define las características del procesador.
     */
    public Ordenador(Rato rato, Pantalla pantalla, Cpu procesador) {
        this.rato = rato;
        this.pantalla = pantalla;
        this.procesador = procesador;
    }
    
    /**
     * Método que establece el valor del parámetro rato.
     * @param rato El parámetro rato define las características del ratón.
     */
    public void setRato(Rato rato) {
        this.rato = rato;
    }
    /**
     * Método que devuelve el valor del parámetro rato.
     * @return El valor del parámetro rato.
     */
    public Rato getRato() {
        return rato;
    }
    /**
     * Método que establece el valor del parámetro pantalla.
     * @param pantalla El parámetro pantalla define
     * las características de la pantalla.
     */
    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }
    /**
     * Método que devuelve el valor del parámetro pantalla.
     * @return El valor del parámetro pantalla.
     */
    public Pantalla getPantalla() {
        return pantalla;
    }
    /**
     * Método que establece el valor del parámetro procesador.
     * @param procesador El parámetro procesador define
     * las características del procesador.
     */
    public void setProcesador(Cpu procesador) {
        this.procesador = procesador;
    }
    /**
     * Método que devuelve el valor del parámetro procesador.
     * @return El valor del parámetro procesador.
     */
    public Cpu getProcesador() {
        return procesador;
    }
    /**
     * Método que muestra en pantalla las diferentes 
     * características del ordenador.
     */
    public void amosar() {
        System.out.println("\n\n\n---ORDENADOR---");
        System.out.println("\nTipo de rato: "+getRato().getTipo()+"\n\nMarca da pantalla: "+
        getPantalla().getMarca()+"\nPulgadas: "+getPantalla().getPulgadas()+
        "\n\nVelocidade do procesador: "+getProcesador().getVelocidade()+
        "\nMemoria: "+getProcesador().getMemoria());
    }

}