package constructor;

public class Libro {
    private String titulo;
    private String isbn;
    private String matricula;

    Libro(String titulo, String isbn, String matricula){
        this.titulo = titulo;
        this.isbn = isbn;
        this.matricula = matricula;
    }

    public String getTitulo(){
        return this.titulo;
    }
}