package v0;

public class Principal {
    public static void main(String[] args){
        Miembro m1 = new Miembro("Antonio");//Instanciando a un nuevo miembro
        m1.leerLibro();//Antonio comienza a leer el libro
        Miembro m2 = new Miembro("Alberto");//Instanciando a un nuevo miembro
        m2.leerLibro();//Antonio comienza a leer el libro
    }
}