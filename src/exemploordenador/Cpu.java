package exemploordenador;

/**
 * @author dcancelas
 */
public class Cpu {
    
    private int velocidade;
    private int memoria;

    /**
     * Constructor sin parámetros.
     */
    public Cpu() {

    /**
     * Constructor con parámetros.
     * @param velocidade El parámetro velocidad define la velocidad de la CPU.
     * @param memoria El parámetro memoria define la memoria de la CPU.
     */
    }
    public Cpu(int velocidade, int memoria) {
        this.velocidade = velocidade;
        this.memoria = memoria;
    }

    /**
     * Método que establece el valor del parámetro velocidade.
     * @param velocidade El parámetro velocidade define
     * la velociad de la CPU.
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    /**
     * Método que devuelve el valor del parámetro velocidade.
     * @return El valor del parámetro velocidade.
     */
    public int getVelocidade() {
        return velocidade;
    }
    /**
     * Método que establece el valor del parámetro memoria.
     * @param memoria El parámetro memoria define
     * la memoria de la CPU.
     */
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    /**
     * Método que devuelve el valor del parámetro memoria.
     * @return El valor del parámetro memoria.
     */
    public int getMemoria() {
        return memoria;
    }

}