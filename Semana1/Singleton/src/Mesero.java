public class Mesero {
    private static Mesero mesero;

    private Mesero() {
        System.out.println("Ernesto se puso su uniforme y está listo para trabajar (constructor)");
    }

    public static Mesero getMesero(){
        if (mesero == null)
            mesero = new Mesero();
        return mesero;
    }
}