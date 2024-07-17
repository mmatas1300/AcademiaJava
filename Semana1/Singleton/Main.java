public class Main {
    public static void main(String[] args) {
        System.out.println("Nuestro café ha abierto, Ernesto es nuestro único mesero y llegó a su jornada de hoy");
        Mesero mesero = Mesero.getMesero();//Creando una instancia de nuestro único mesero

        System.out.println("Un cliente solicita un mesero para decirle su orden");
        Mesero meseroOrden1 = Mesero.getMesero();

        System.out.println("Otro cliente solicita un mesero para decirle su orden");
        Mesero meseroOrden2 = Mesero.getMesero();


        System.out.println("¿Es Ernesto (mesero) quien atiende la orden 1 (meseroOrden1)?: " + (mesero == meseroOrden1));
        System.out.println("¿Es Ernesto (mesero) quien atiende la orden 2 (meseroOrden2)?: " + (mesero == meseroOrden2));

        System.out.println(mesero);
        System.out.println(meseroOrden1);
        System.out.println(meseroOrden2);

    }
}