package desafios;
import java.util.Random;
import java.util.Scanner;

class Jumangi {
    public static void main(String [] args) {
        int respI = 0, contador = 1, resp1 = 0, total=0, casilla1=0;
        Scanner intro = new Scanner(System.in);
        do{
            System.out.println("Estan listos para iniciar la partida (1.Si/2.No)");
            respI = intro.nextInt();
        }while(respI != 1);
        do{
            do{
              System.out.println("Turno nº"+contador);
              System.out.println("J1: ¿Estas listo?(1.Si/2.No)");
              resp1 = intro.nextInt();
              if((resp1>1)&&(resp1<=2)){
                  System.out.println("J1: Tomate tu tiempo.");
              }
              Random aleatorio = new Random();
              int d1j1 = 1 + aleatorio.nextInt(6);
              Random aleatorio2 = new Random();
              int d2j1 = 1 + aleatorio2.nextInt(6);
              total = d1j1+ d2j1;
              System.out.println("Dado1: "+d1j1+"Dado2: " + d2j1 + "Total");
              casilla1 = casilla1+total;
              if((casilla = 4)||(casilla=6)||(casilla=8)||(casilla=12)||(casilla=14)||(casilla=16)||(casilla=18)||(casilla=22)||(casilla=24)||(casilla=26)||(casilla=)||(casilla=)||(casilla=)||(casilla=)||(casilla=)) {
                System.out.println("J: Has caido en una casilla par, avanzas 2 casilla");
                casilla = casilla + 2;
              }else if((casilla=1)||(casilla=5)||(casilla=9)||(casilla=15)||(casilla=21)||(casilla=25)){
                 System.out.println("J : Has caido en una casilla impar, retrocedes 1 casilla");
                 casilla = casilla - 1;
              }else if((casilla = 10)||(casilla = 20)){
                 System.out.println("J : Has caido en una multiplo de 10, avanzas 5 casillas");
                 casilla = casilla + 5;
              }else if((casilla = 2)||(casilla = 3)||(casilla = 5)||(casilla = 7)||(casilla = 11)||(casilla = 17)||(casilla = 19)||(casilla = 23)){
                  if (casilla=2){
                      System.out.println("J : Has caido en una casilla impar, retrocederas a la casilla prima mas cercana, pero por ser 2 el primo mas pequeño concervaras tu lugar");
                  }else if(casilla = 3){
                      System.out.println("J : Has caido en una casilla de numero primo, retrocederas al numero prima mas cercana");
                      casilla = casilla - 1;
                  }else if(casilla = 5){
                      System.out.println("J : Has caido en una casilla de numero primo, retrocederas al numero prima mas cercana");
                      casilla = casilla - 2;
                  }else if(casilla = 7){
                      System.out.println("J : Has caido en una casilla de numero primo, retrocederas al numero prima mas cercana");
                      casilla = casilla - 2;
                  }else if(casilla = 11){
                      System.out.println("J : Has caido en una casilla de numero primo, retrocederas al numero prima mas cercana");
                      casilla = casilla - 4;
                  }else if(casilla = 17){
                      System.out.println("J : Has caido en una casilla de numero primo, retrocederas al numero prima mas cercana");
                      casilla = casilla - 6;
                  }else if(casilla = 19){
                      System.out.println("J : Has caido en una casilla de numero primo, retrocederas al numero prima mas cercana");
                      casilla = casilla - 2;
                  }else if(casilla = 23){
                      System.out.println("J : Has caido en una casilla de numero primo, retrocederas al numero prima mas cercana");
                      casilla = casilla - 4;
                  }
              }else if (casilla = 13){
                  System.out.println("Has caido en el 13, vuelves al inicio...");
              }
            }();
            
            
        }while((casilla1 < 27)||(casilla2 < 27)||(casilla3 < 27))
        
        
    }
}
