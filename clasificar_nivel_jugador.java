import java.util.Scanner;

public class clasificar_nivel_jugador {
    public static void puntos (){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el puntaje del jugador: ");
        int puntaje = teclado.nextInt();

        if (puntaje < 50){
            System.out.println("nivel principiate 😒");}
        else if(puntaje < 100){
            System.out.println("nivel intermedio 😐");
            }
        else if (puntaje < 150){
            System.out.println("nivel avazado 😉🎉");
        }else {
            System.out.println("nivel experto 😎🎉");
        }

    }
}
