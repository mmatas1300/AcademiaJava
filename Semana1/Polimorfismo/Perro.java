public class Perro extends Animal implements Mascota{

    private String raza;
    
    public Perro(String nombre, int edad, String raza){
        super(nombre,edad,"canino");
        this.raza = raza;
    }

    @Override
    public void comer(){
        System.out.println("Soy un " + this.getClass().getSimpleName() + ", me llamo " + this.getNombre() + " y voy a comer croquetas");
    }

    @Override
    public void dormir(){
        System.out.println("Soy un " + this.getClass().getSimpleName() + ", me llamo " + this.getNombre() + " y me voy a dormir");
    }

    public void jugar(){
        System.out.println("Soy " + this.getNombre() + ", vamos a jugar amigo!!!");
    }

    public void pedirMimos(){
        System.out.println("Dame amor amigo!!!");
    }

    @Override
    public String toString(){
        return "Animal: Perro |" + " Nombre: " + this.getNombre();
    }
}