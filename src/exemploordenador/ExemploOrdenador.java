package exemploordenador;

import java.util.Scanner;

/**
 * Esta clase contiene un escáner que se encarga de recoger los
 * datos necesarios para la ejecución del resto de clases.
 * @author dcancelas
 * @version 1.0.0
 */
public class ExemploOrdenador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nIntroduce o tipo de rato: ");
                String tipo = sc.next();
            System.out.print("Introduce a marca da pantalla: ");
                String marca =sc.next();
            System.out.print("Introduce as súas pulgadas: ");
                float pulgadas = sc.nextFloat();
            System.out.print("Introduce a velociadade da CPU: ");
                int velocidade = sc.nextInt();
            System.out.print("Introduce a súa memoria: ");
                int memoria = sc.nextInt();
        sc.close();

        Ordenador ordenador1 = new Ordenador(new Rato(tipo),
        new Pantalla(marca, pulgadas), new Cpu(velocidade, memoria));
            ordenador1.amosar();
    }
    
}
