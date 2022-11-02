public class Main {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();
        
        persona.setEdad(25);
        persona.setNombre("David");
        persona.setTelefono("123456");

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}

class Persona{
    //Variables
    private int edad;
    private String nombre;
    private String telefono;

    //Gets Y Sets
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return this.telefono;
    }
}
