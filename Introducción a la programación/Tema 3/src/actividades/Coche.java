package actividades;

public class Coche {
    //Declaración de variable
    int numeroDePuertas;

    public Coche(int puertas) {
        this.numeroDePuertas = puertas;
    }

    public int incrementarPuertas () {
        return this.numeroDePuertas++;
    }

}
