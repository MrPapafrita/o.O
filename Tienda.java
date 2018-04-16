package desafios;
import java.util.Scanner;

class Tienda {

    public static void main(String[] args) {
        int contador=1,comprasT=0, puntos=0, comprasD=0, comprasP=0, metodo=0, puntosCA=0, puntosDinero=0;
        float valorO=0, codigo=0, puntosC;
        
        Scanner intro = new Scanner (System.in);
        
        do{
            try{
            System.out.println("Ingrese el numero de compras: ");
            comprasT=intro.nextInt();
            }catch(NumberFormatException ex){
        	System.out.println("Numero no valido, ingrese nuevamente");
    	}
            if(comprasT < 0){
                System.out.println("Numero de compras invalido, ingrese nuevamente");
            }
        }while(comprasT<0);
        
        while(contador<=comprasT){

            puntosDinero = puntos*10;
            do{
            try{
                System.out.println("Ingrese el codigo del producto: ");
            codigo=intro.nextFloat();
            }catch(NumberFormatException ex){
        	System.out.println("No es un codigo valido, reinicie esta venta");
    	}
            if(codigo<100){
                System.out.println("No es un codigo valido, reinicie esta venta");
            }
            }while(codigo < 100);
            
            do{
            try{
                System.out.println("Ingrese el valor del producto: ");
                valorO=intro.nextFloat();
            }catch(NumberFormatException ex){
        	System.out.println("Monto no valido, reinicie esta venta");
    	}
            if(valorO<0){
                System.out.println("Monto no valido, reinicie esta venta");
            }
            }while(valorO < 0);
            
            do{
            try{
                System.out.println("Ingrese su metodo de pago: (1.Dinero/2.Puntos)");
            metodo=intro.nextInt();
            }catch(NumberFormatException ex){
        	System.out.println("No es un metodo valido, reinicie esta venta");
    	}
            if((metodo<1)||(metodo>3)){
                System.out.println("No es un metodo valido, reinicie esta venta");
            }
            if (((metodo>1)&&(metodo<3))&&((puntosDinero<valorO))){
                System.out.println("No posee puntos suficientes, opcion 1 seleccionada automaticamente");
                metodo=1;
            }
            }while((metodo<1)&&(metodo>3));
            
                if((codigo>=100)&&(codigo<200)&&(valorO<=10000)){
                    puntosC = valorO/100;
                    puntosCA= Math.round(puntosC);
                    puntos = puntos+puntosCA;
                    comprasD=comprasD+1;
                }else if((codigo>=200)&&(codigo<300)&&(valorO<=10000)){
                    puntosC = valorO/50;
                    puntosCA= Math.round(puntosC);
                    puntos = puntos+puntosCA;
                    comprasD=comprasD+1;
                }
            
                if((codigo>=100)&&(codigo<200)&&(valorO>10000)){
                    puntosC = valorO/50;
                    puntosCA= Math.round(puntosC);
                    puntos = puntos+puntosCA;
                    comprasD=comprasD+1;
                }else if((codigo>=200)&&(codigo<300)&&(valorO>10000)){
                    puntosC = valorO/30;
                    puntosCA= Math.round(puntosC);
                    puntos = puntos+puntosCA;
                    comprasD=comprasD+1;
                }
                if ((metodo>1)&&(metodo<3)){
                    
                    
                }
                contador++;
            }
        System.out.println(":o"+comprasD);
        System.out.println("XDXDXDXD"+comprasP);
            }
    }
