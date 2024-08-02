public class Ej11 {
    public static void main(String[] args) {
        Padre objetoPadre = new Padre();
        Hija objetoHija = new Hija();
        Padre objetoHija2 = (Padre) new Hija();

        objetoPadre.llamarClase();
        objetoHija.llamarClase();
        objetoHija2.llamarClase();

        Hija objetoHija3 = (Hija) new Padre();
        objetoHija3.llamarClase();
    }
}

class Hija extends Padre {
    public Hija() {
        // Constructor de la clase Hija
    }

    @Override
    public void llamarClase() {
        System.out.println("Llame a la clase Hija");
    }
}

class Padre {
    public Padre() {
        // Constructor de la clase Padre
    }

    public void llamarClase() {
        System.out.println("Llame a la clase Padre");
    }
}