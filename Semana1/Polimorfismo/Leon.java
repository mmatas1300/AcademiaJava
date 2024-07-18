public class Leon extends Animal{
    public Leon(String nombre, int edad){
        super(nombre,edad,"felino");
    }

    @Override
    public void comer(){
        System.out.println("Soy un " + this.getClass().getSimpleName() + ", me llamo " + this.getNombre() + " y voy a comer gacelas");
    }

    @Override
    public void dormir(){
        System.out.println("Soy un " + this.getClass().getSimpleName() + ", me llamo " + this.getNombre() + " y me voy a dormir");
    }

    @Override
    public String toString(){
        return "Animal: León |" + " Nombre: " + this.getNombre();
    }
}