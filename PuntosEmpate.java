import java.util.Scanner;

public class PuntosEmpate {
    //Metodo para calcular los puntos * empate
    public static int calcularPuntosEmpate() {

        Scanner scaner= new Scanner(System.in);
        System.out.println("\n    PUNTOS POR EMPATE   ");
        //Entrada de datos & Declaracion de variables
        System.out.print("\nIngrese el puntaje actual del jugador: ");
        int puntajeActual = scaner.nextInt();

        System.out.print("Ingrese la cantidad de empates obtenidos: ");
        int empates = scaner.nextInt();

        //Calculo de nuevo puntaje
        int nuevoPuntaje = puntajeActual + empates;

        System.out.println("\nPuntaje actual: " + puntajeActual);
        System.out.println("Empates: " + empates);
        System.out.println("Puntos obtenidos por empate: " + empates);
        System.out.println("Nuevo puntaje: " + nuevoPuntaje);

        return nuevoPuntaje;
    }
}
