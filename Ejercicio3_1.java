package ejemplos;
import java.util.Scanner;

class Ejercicio3_1 {

    public static void main(String[] args) {
        float radio;
        float altura;
        float areaLateral = 0;
        float areaBase = 0;
        float areaTotal = 0;
        float volumen = 0;
        
    Scanner intro = new Scanner (System.in);
    
    System.out.println("Ingrese el radio");
        radio = intro.nextFloat();
    System.out.println("Ingrese la altura");
        altura = intro.nextFloat();
    if ((radio>0) && (altura>0)) {
        areaLateral = (float) (2*3.14*radio*altura);
        areaBase = (float) (3.14*radio*radio);
        areaTotal = areaLateral+(2*areaBase);
        volumen = areaBase*altura;
    }
    System.out.println("El area lateral del cilindro es" + areaLateral);
    System.out.println("El area base del cilindro es" + areaBase);
    System.out.println("El area total del cilindro es" + areaTotal);
    System.out.println("El volumen del cilindro es" + volumen);
    }
}