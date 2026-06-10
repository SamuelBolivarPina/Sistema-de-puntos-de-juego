import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("=== Sistema de Puntos de Juego ===\n" +
                "\n" +
                "1. Calcular puntos por victoria\n" +
                "2. Calcular puntos por empate\n" +
                "3. Calcular penalización\n" +
                "4. Clasificar nivel del jugador\n" +
                "5. Salir\n");
        System.out.println("Ingrese la opcion que desea:");// menu

        while (!teclado.hasNextInt()) {
            System.out.println("Por favor, ingresa un número válido del 1 al 5:");
            teclado.next();
        }

        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                Sumadevictoria.ejecutar();;
                break;

            case 2:
               PuntosEmpate.calcularPuntosEmpate();
                break;
            case 3:
                CalculadoraPenalizacion.main(teclado);

                break;
            case 4:
                clasificar_nivel_jugador.puntos();

                break;
            case 5:
                System.out.println("\nCerrando sesión del juego... ¡Gracias por jugar!");

                break;
            default:
                System.out.println("el numero que ingreso no esta en el menu");

        }

    } while(opcion !=5);
}

public static double pedirNumero(Scanner teclado, String mensaje) {
    System.out.println(mensaje);
    while (!teclado.hasNextDouble()) {
        System.out.println("Error: ¡Eso no es un número! Inténtalo de nuevo:");
        teclado.next(); // Limpia la letra de la memoria
    }
    return teclado.nextDouble();
}

}