import java.util.Scanner;

public class CalculadoraPenalizacion {

    // Constante que define cuántos puntos se restan por cada penalización
    public static final int VALOR_PENALIZACION = 2;

    
    public static int aplicarPenalizacion(int puntosActuales, int cantidadPenalizaciones) {
        // Validación: Si el número de penalizaciones es negativo por error, no resta nada.
        if (cantidadPenalizaciones < 0) {
            return puntosActuales;
        }

        int totalARestar = cantidadPenalizaciones * VALOR_PENALIZACION;
        int nuevosPuntos = puntosActuales - totalARestar;

        // Uso de Math.max para evitar que el puntaje caiga por debajo de cero
        return Math.max(0, nuevosPuntos);
    }

    // --- Método main para probar la funcionalidad de forma aislada ---
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PRUEBA DE MÓDULO: PENALIZACIONES ===");
        
        // Simulamos que el jugador ya viene con algunos puntos de victorias/empates
        System.out.print("Introduce el puntaje actual del jugador (ej. 10): ");
        int puntosActuales = scanner.nextInt();

        System.out.print("Introduce la cantidad de penalizaciones recibidas: ");
        int penalizaciones = scanner.nextInt();

        // Ejecución de la lógica del Dev 3
        int puntajeFinal = aplicarPenalizacion(puntosActuales, penalizaciones);

        // Mostrar resultados de la prueba
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Puntos antes: " + puntosActuales);
        System.out.println("Penalizaciones aplicadas: " + penalizaciones + " (Total restado: " + (penalizaciones * VALOR_PENALIZACION) + " pts)");
        System.out.println("Puntaje Final: " + puntajeFinal + " pts");
        
        scanner.close();
    }
}
