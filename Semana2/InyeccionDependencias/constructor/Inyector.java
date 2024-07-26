package constructor;

public class Inyector {
    static Miembro asignarLibro(String nombre, Libro libro){
        return new Miembro("nombre",libro);
    }
}