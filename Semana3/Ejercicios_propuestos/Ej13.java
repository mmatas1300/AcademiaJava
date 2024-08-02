public class Ej13 {
 
    public static void main(String[] args) {
        Cambios uno=new Cambios();
        int x=1;
        String hola="hola";
        StringBuilder hola2=new StringBuilder("hola2");
        Integer x2=4;
        uno.makeSound(x, hola);
        uno.makeSound(x2, hola2);
        System.out.println("Cambios?: "+x+","+hola+","+x2+","+hola2);
    }


}

class Cambios{

   void makeSound(int x, String s) {
       s="cambiando string";
       x=5;
   }

   void makeSound(Integer x,StringBuilder s) {
        x=9;
        s=s.delete(0,s.length());
   }
 
}