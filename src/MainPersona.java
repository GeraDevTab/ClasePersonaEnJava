

public class MainPersona {
    public static void main(String[] args) {
        Persona andre = new Persona();
        andre.nombre = "Andre Silva";
        andre.edad = 21;
        System.out.println(andre.mostrarDatos());

        Persona helen = new Persona();
        helen.nombre = "Helen Cardoso";
        helen.edad = 24;
        System.out.println(helen.mostrarDatos());
    }
}
