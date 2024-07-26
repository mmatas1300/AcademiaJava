package campo;

public class Miembro {
    private String nombre;

    //Inyeccion por campo/variable
    Libro libroPedido;

    Miembro(String nombre){
        this.nombre = nombre;
    }

    public void leerLibro(){
        System.out.println("Hola, soy " + this.nombre + " y voy a leer " + this.libroPedido.getTitulo());
    }
}