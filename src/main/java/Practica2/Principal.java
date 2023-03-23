package Practica2;

import java.util.concurrent.TimeUnit;

public class Principal {
    public static void main(String[] args) {
        try{
            Tablero tablero = new Tablero();
            System.out.println("Simulación con tablero leído");
            tablero.leerEstadoActual();
            System.out.println(tablero);
            for(int i = 0; i < 5; i++){
                TimeUnit.SECONDS.sleep(1);
                tablero.transitarAlEstadoSiguiente();
                System.out.println(tablero);
            }

            System.out.println("Simulación con tablero generado por Montecarlo");
            tablero.generarEstadoActualPorMontecarlo();
            System.out.println(tablero);
            for(int i = 0; i < 15; i++){
                TimeUnit.SECONDS.sleep(1);
                tablero.transitarAlEstadoSiguiente();
                System.out.println(tablero);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

}
