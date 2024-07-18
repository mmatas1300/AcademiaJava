public abstract class Animal{
    private String nombre;
    private int edad;
    private String grupo;

    public Animal(String nombre, int edad, String grupo){
        this.nombre = nombre;
        this.edad = edad;
        this.grupo = grupo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public void comer(){
        System.out.println("Soy un animal y voy a comer");
    }
    public void dormir(){
        System.out.println("Soy un animal y voy a dormir");
    }
}