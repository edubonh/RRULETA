package pkg0900.pkg17.pkg7783_ruleta;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //objeto de tipo Ruleta que representa el juego y sus funciones.
        Ruleta ruleta = new Ruleta();

        //objeto que permite la entrada de datos desde el buffer
        Scanner teclado = new Scanner(System.in);

        //variable de control que permite que el usuario indique si desea continuar o no en el juego
        String continuar = "s";

        //ciclo que mantiene al usuario juando hasta que decida finalizar o su saldo llege a un valor menor al definido en MONTO_APUESTA.
        do {
            if (ruleta.getMonto() >= ruleta.getMontoApuesta()) {
                ruleta.iniciarRuleta();

                System.out.println("CONTINUAR APOSTADO EN LA RULETA (S/N)??");
                continuar = teclado.nextLine();
            } else {
                System.out.println("Usted quebrò!!, ya no puede jugar màs. . .");
                continuar = "N";
            }
        } while (continuar.toLowerCase().equals("s"));
        //fin ciclo while
    }
}
