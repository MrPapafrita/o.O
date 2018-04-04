package ejercicio3_3;
import java.util.Scanner;

class Ejercicio3_4 {
    
    public static void main (String[] args) {
        float num1;
        float num2;
        float num3;
        float adicion=0;
        float promedio=0;
        float doble;
        float triple;
        float cuadrado;
        
    Scanner intro = new Scanner (System.in);
    System.out.println("ingrese el primer numero");
        num1 = intro.nextFloat();
    System.out.println("ingrese el segundo numero");
        num2 = intro.nextFloat();
    System.out.println("ingrese el tercer numero");
        num3 = intro.nextFloat();
        {
            adicion = num1+num2+num3;
            promedio = adicion/3;
            doble = num1*2;
            triple= num2*3;
            cuadrado = num3*num3;
        }
    System.out.println("el promedio es: " +promedio);
    System.out.println("El doble del primer numero es: " +doble);
    System.out.println("El triple del segundo numero es: " +triple);
    System.out.println("El cuadrado del tercer numero es: " +cuadrado);
    }
}