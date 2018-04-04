package ejercicio3_3;
import static java.lang.Math.floor;
import java.util.Scanner;

class Ejercicio3_3 {
    
    public static void main (String[] args) {
        int años;
        int dias = 0;
        int diasBiciestos = 0;
        int diasTotal = 0;
    Scanner intro = new Scanner (System.in);
    
    System.out.println("Ingrese su edad (años)");
        años = intro.nextInt();
        {
            diasBiciestos = años/4;
            diasBiciestos = (int) Math.floor(diasBiciestos);
            dias = años * 365;
            diasTotal = dias + diasBiciestos;
        }
    System.out.println("Usted a vivido: " + diasTotal);
    }
}