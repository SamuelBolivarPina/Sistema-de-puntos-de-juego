public class Sumadevictoria {
    public static void main(String[] args) {
        // Creao el jugador con 0 puntos
        JugadorConPuntos jugador = new JugadorConPuntos();

        System.out.println("--- INICIO DEL JUEGO ---");
        System.out.println("Puntos al empezar: " + jugador.getPuntos());

        // --- SIMULACIÓN DE VICTORIA ---
        jugador.sumarVictoria(); 

        System.out.println("\n--- FIN DE LA PARTIDA ---");
        System.out.println("Puntos totales por ganar: " + jugador.getPuntos());
    }
}
// CLASE AUXILIAR (Aquí se guardan y suman los puntos)
// NOTA: Al no llevar la palabra "public", Java te permite
class JugadorConPuntos {
    private int puntos = 0; // Empieza en cero

    // Este método suma 100 puntos cada vez que lo llamas
    public void sumarVictoria() {
        this.puntos += 100; 
        System.out.println("[SISTEMA] ¡Ganaste! Se te han sumado 100 puntos.");
    }

    // Este método te devuelve los puntos actuales
    public int getPuntos() {
        return this.puntos;
    }
}

