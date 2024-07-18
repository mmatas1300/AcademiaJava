public class Zoo{
    public static void main(String[] args){
        Animal[] animales ={
                new Leon("Simba",6),
                new Perro("Huesos",4,"chihuahua")
        };
        System.out.println("----Nuestro zoo cuenta con los siguientes animales:");
        for(Animal animal:animales){
            System.out.println(animal.toString());
        }

        System.out.println("----Es hora de alimentar a los animales");
        for(Animal animal:animales){
            animal.comer();
        }

        System.out.println("----Durante la comida voy a acariciar a los animales");
        for(Animal animal:animales){
            if(animal instanceof Mascota){
                ((Mascota) animal).jugar();
            }
        }

        System.out.println("----Es hora de que los animales duerman");
        for(Animal animal:animales){
            animal.dormir();
        }
    }
}