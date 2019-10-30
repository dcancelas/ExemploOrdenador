package exemploordenador;

/**
 * 
 * @author dcancelas
 */
public class Pantalla {
    
    private String marca;
    private float pulgadas;

    /**
     * Constructor sin parámetros.
     */
    public Pantalla() {

    /**
     * Constructor con parámetros.
     * @param marca El parámetro marca define la marca de la pantalla.
     * @param pulgadas El parámetro marca define las pulgadas de la pantalla.
     */
    }
    public Pantalla(String marca, float pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    /**
     * Método que establece el valor del parámetro marca.
     * @param marca El parámetro marca define
     * la marca de la pantalla.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Método que devuelve el valor del parámetro velocidade.
     * @return El valor del parámetro velocidade.
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Método que establece el valor del parámetro pulgadas.
     * @param pulgadas El parámetro pulgadas define
     * las pulgadas de la pantalla.
     */
    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }
    public float getPulgadas() {
        return pulgadas;
    }

}