package pkg0900.pkg17.pkg7783_ruleta;

import java.util.Scanner;

//Ramdon utilizad java.lan.Random, paquete lan se importa por default

/**
 *
 * @author edydu
 */
public class Ruleta {
    //variables de control

    //monto incial del jugador
    public float montoJugador = 100;
    //se utiliza para calcular la ganancia si el jugador aciera el numero (monto * factor)
    public static final int FACTOR_ACIERTO_NUMERO = 3;
    //se utiliza para calcular la ganancia si el jugador aciera el color (monto * factor)
    public static final int FACTOR_ACIERTO_COLOR = 2;
    //monto estandar de apuesta
    public static final int MONTO_APUESTA = 10;
    //array con los numero estilo ASCII ART para imprimir en consola
    public final String[] ASCII_NUMEROS;
    //sirve para leer desde el buffer (teclado)
    public Scanner teclado;

    /**
     * Constructor
     */
    public Ruleta() {
        ASCII_NUMEROS = NumerosASCIIArt.getNumerosASCIIArt();
        teclado = new Scanner(System.in);
    }

    /**
     *
     * retorna el monto actual del jugador
     */
    public float getMonto() {
        return this.montoJugador;
    }

    /**
     *
     * @param indice recibe un no. del 1 al 10 e imprime su ASCII ART
     */
    public void imprimirNumero(int indice) {
        System.out.println(ASCII_NUMEROS[indice]);
    }

    /**
     *
     * @param factor define el numero maximo que generara aleatoriamente
     * @return genera numeros aleatorios
     */
    public int numeroAleatorio(int factor) {
        int resultado = 0;
        resultado = (int) Math.ceil(Math.random() * factor);
        return resultado;
    }

    /**
     * Realizar 10000 simulaciones de generacion de numeros aleatorios para
     * verificar que se generan solo en el rango indicado. El metodo no se usa
     * en el programa unicamente como test
     */
    public void testAleatorio() {
        int[] pruebas = new int[11];
        for (int i = 0; i < 10000; i++) {
            pruebas[numeroAleatorio(10)]++;
        }

        for (int i = 0; i < pruebas.length; i++) {
            System.out.println("Pruebas[" + i + "] =" + pruebas[i]);
        }

    }

    /**
     * Imprime los datos del jugado: saldo actual, monto apuesta y factores de
     * ganancia.
     */
    public void imprimirDatosJugador() {
        System.out.printf("%25s %8.2f\n", "SALDO ACTUAL=", montoJugador);
        System.out.printf("%25s %d\n", "Factor acierta Numero= *", FACTOR_ACIERTO_NUMERO);
        System.out.printf("%25s %d\n", "Factor acierta Color= *", FACTOR_ACIERTO_COLOR);
        System.out.println("-----------------------------");
    }

    /**
     *
     * @param numero nuermo a testear
     * @return true indica que el numero es par, false si el no. es impar.
     * (testear dos numeros permite identificar el jugador acierta el color del
     * no. ambos impares o ambos pares)
     */
    public boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public float getMontoApuesta() {
        return this.MONTO_APUESTA;
    }

    /**
     *
     * @param eleccion numero elegido por el juador.
     * @param numeroRuleta numero aleatorio generado por la ruleta.
     * @param apuesta monto de la apuesta
     * @return String indicando el resultado del juego actual. el metodo maneja
     * los montos de perdidad o ganancia y actualiza el saldo del jugador.
     */
    public String evaluarResultado(int eleccion, int numeroRuleta, int apuesta) {
        String evaluacion = "";
        montoJugador -= apuesta;
        if (eleccion == numeroRuleta) {
            int montoGanadoN = apuesta * FACTOR_ACIERTO_NUMERO;
            montoJugador += montoGanadoN;
            evaluacion = "Usted acertò el NUMERO, ganò " + montoGanadoN;
        } else if (esPar(eleccion) == esPar(numeroRuleta)) {
            int montoGanadoC = apuesta * FACTOR_ACIERTO_COLOR;
            montoJugador += montoGanadoC;
            evaluacion = "Uste acerto COLOR DEL NUMERO, ganò " + montoGanadoC;
        } else {
            evaluacion = "Usted HA PERDIDO Q. " + apuesta;
        }
        return evaluacion;
    }

    /**
     * Vease como la interfaz de usuario. realiza las acciones necesarias para
     * que el jugador interactue con la ruleta.
     */
    public void iniciarRuleta() {
        // TODO code application logic here
        //testAleatorio();
        imprimirDatosJugador();

        int eleccion = 0;
        do {
            System.out.print("Bienvenido, por favor elige un Numero del uno (1) al diez (10)");
            eleccion = teclado.nextInt();
        } while (eleccion > 10 || eleccion <= 0);

        System.out.println("Usted eligiò el numero>" + eleccion + ((esPar(eleccion)) ? " *PAR_black" : " *IMPAR_white"));
        int numeroAleatorio = numeroAleatorio(10);
        System.out.println("NUMERO RULETA:" + numeroAleatorio + ((esPar(numeroAleatorio)) ? " *PAR_black" : " *IMPAR_white"));

        imprimirNumero(numeroAleatorio);

        String resultado = evaluarResultado(eleccion, numeroAleatorio, MONTO_APUESTA);
        System.out.println("*****" + resultado + "******");

        imprimirDatosJugador();
    }

}
