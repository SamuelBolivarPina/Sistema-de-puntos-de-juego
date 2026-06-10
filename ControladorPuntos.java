import java.util.Scanner;

public class ControladorPuntos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        JugadorUnico jugador = new JugadorUnico();

        do {
            System.out.println("\n=======================================");
            System.out.println("   BIENVENIDO AL SISTEMA DE PARTIDAS   ");
            System.out.println("=======================================");
            System.out.println("1. Registrar Victoria (+100 pts)");
            System.out.println("2. Consultar Puntaje Actual");
            System.out.println("3. Reiniciar Marcador a 0");
            System.out.println("4. Salir del Sistema");
            System.out.println("=======================================");
            System.out.print("Ingrese la opción que desea: ");

            while (!teclado.hasNextInt()) {
                System.out.println("Por favor, ingresa un número válido del 1 al 4:");
                teclado.next();
            }
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n[PROCESANDO...] Simulando fin de la partida...");
                    jugador.sumarVictoria();
                    break;
                case 2:
                    System.out.println("\n---------------------------------------");
                    System.out.println("🏆 PERFIL JUGADOR 🏆");
                    System.out.println("Puntos totales acumulados: " + jugador.getPuntos());
                    System.out.println("---------------------------------------");
                    break;
                case 3:
                    jugador.reiniciarPuntos();
                    break;
                case 4:
                    System.out.println("\nCerrando sesión del juego... ¡Gracias por jugar!");
                    break;
                default:
                    System.out.println("\n❌ El número que ingresó no está en el menú.");
            }
            
        } while (opcion != 4);

        teclado.close();
    }
}

class JugadorUnico {
    private int puntos = 0; 

    public void sumarVictoria() {
        this.puntos += 100; 
        System.out.println("🎮 ¡SISTEMA!: ¡Victoria registrada! +100 puntos.");
    }

    public int getPuntos() {
        return this.puntos;
    }

    public void reiniciarPuntos() {
        this.puntos = 0;
        System.out.println("🔄 ¡SISTEMA!: El marcador ha sido reiniciado a 0.");
    }
}