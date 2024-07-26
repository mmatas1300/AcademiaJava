package constructor;

public class Miembro {
    private String nombre;

    //Inyeccion por constructor
    private Libro libroPedido;

    Miembro(String nombre, Libro libroPedido){
        this.nombre = nombre;
        this.libroPedido = libroPedido;
    }

    public void leerLibro(){
        System.out.println("Hola, soy " + this.nombre + " y voy a leer " + this.libroPedido.getTitulo());
    }

    public void setLibroPedido(Libro libroPedido){
        this.libroPedido = libroPedido;
    }
}