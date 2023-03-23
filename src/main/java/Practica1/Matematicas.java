package Practica1;

public class Matematicas {
    public static double generarNumeroPi(long pasos){
        int aciertos = 0;
        double areaCuadrado = 4;
        for (int i = 1; i <= pasos; i++){
            double x = Math.random() * 2 - 1;
            double y = Math.random() * 2 - 1;
            if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 1){
                aciertos++;
            }
        }
        return (areaCuadrado * (aciertos / (double) pasos));
    }
}
