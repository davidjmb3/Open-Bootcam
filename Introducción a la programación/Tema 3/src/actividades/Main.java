package actividades;

import static actividades.Suma.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //Primera Parte
        sumaDeTresNumeros(20,30,40);

        //Segunda Parte
        Coche miCoche = new Coche(4);
        miCoche.incrementarPuertas();
        System.out.println(miCoche.numeroDePuertas);        
    }
}
