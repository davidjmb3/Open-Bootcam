public class App {
    public static void main(String[] args) throws Exception {
        //Objeto cliente
        Cliente cliente = new Cliente();

        //Dandole valores a las propiedades del objeto cliente
        cliente.edad = 25;
        cliente.nombre = "David";
        cliente.telefono = "0123456789";
        cliente.credito = 1000000;

        //Mostrando los valores de las propiedades de el objeto cliente
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Credito: " + cliente.credito);

        //Objeto trabajador
        Trabajador trabajador = new Trabajador();
        

        //Dandole valores a las propiedades del objeto trabajador
        trabajador.edad = 35;
        trabajador.nombre = "José";
        trabajador.telefono = "9876543210";
        trabajador.salario = 500000;

        //Mostrando los valores de las propiedades de el objeto trabajador
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Telefono: " + trabajador.telefono);
        System.out.println("Salario: " + trabajador.salario);

        }
}

class Persona{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}
