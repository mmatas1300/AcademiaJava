package setter;

public class Principal {
    public static void main(String[] args){
        //Instanciando miembros
        Miembro m1 = new Miembro("Antonio");
        Miembro m2 = new Miembro("Alberto");
        //Instanciando libros
        Libro l1 = new Libro("El principito", "978-607-99498-0-8","ASXD9865");
        Libro l2 = new Libro("1984", "978-6073116336","PSKD2846");
        //Asignando libro a cada miembro
        Inyector.asignarLibro(m1,l2);
        Inyector.asignarLibro(m2,l1);

        m1.leerLibro();
        m2.leerLibro();
    }
}