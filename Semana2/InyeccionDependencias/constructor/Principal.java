package constructor;

public class Principal {
    public static void main(String[] args){
        //Instanciando libros
        Libro l1 = new Libro("El principito", "978-607-99498-0-8","ASXD9865");
        Libro l2 = new Libro("1984", "978-6073116336","PSKD2846");
        //Asignando libro a cada miembro
        Miembro m1 = Inyector.asignarLibro("Antonio",l2);
        Miembro m2 = Inyector.asignarLibro("Alberto",l1);

        m1.leerLibro();
        m2.leerLibro();
    }
}