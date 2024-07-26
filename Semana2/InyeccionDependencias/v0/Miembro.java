package v0;

public class Miembro {
    private String nombre;
    //Alto acoplamiento
    private Libro libroPedido = new Libro("El principito","9783140464079","9735ALSK");

    Miembro(String nombre){
        this.nombre = nombre;
    }

    public void leerLibro(){
        System.out.println("Hola, soy " + this.nombre + " y voy a leer " + this.libroPedido.getTitulo());
    }
}