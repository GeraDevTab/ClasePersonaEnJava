public class Persona {
    public String nombre;
    public int edad;

    public String mostrarDatos(){
        return "=== Datos de la Persona ==="+ "\n" +
                "Nombre: "+ this.nombre + "\n" +
                "Edad: "+ this.edad + "\n";
    }
}
