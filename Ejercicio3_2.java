package ejercicio3_2;
import java.util.Scanner;

class Ejercicio3_2 {
    
    public static void main (String[] args) {
        float num1;
        float num2;
        float adicion = 0;
        float producto = 0;
    Scanner intro = new Scanner (System.in);
    
    System.out.println("Ingrese el primer numero");
    num1 = intro.nextFloat();
    System.out.println("Ingrese el segundo numero");
    num2 = intro.nextFloat();
    {
    adicion = num1+num2;
    producto = num1*num2;
    }
    System.out.println("La suma es de: " + adicion);
    System.out.println("La multiplicacion es de: " + producto);    
    }
}

