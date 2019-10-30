package exemploordenador;

/**
 * @author dcancelas
 */
public class Rato {

    private String tipo;

    /**
     * Constructor sin parámetros.
     */
    public Rato() {

    /**
     * Constructor con parámetros.
     * @param tipo El parámetro tipo define el tipo de ratón.
     */
    }
    public Rato(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Método que establece el valor del parámetro tipo.
     * @param tipo El parámetro tipo define el tipo de ratón.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Método que devuelve el valor del parámetro tipo.
     * @return El valor del parámetro tipo.
     */
    public String getTipo() {
        return tipo;
    }

}