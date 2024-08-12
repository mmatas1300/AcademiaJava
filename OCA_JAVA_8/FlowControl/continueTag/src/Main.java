//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //descansar:
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 9; j++) {
                if (i % 2 == 0){
                    System.out.println("Dia "+ i + ": Descansando");
                    //continue descansar;
                }

                System.out.println("Dia "+ i + ": Trabajando " + j + " horas");
            }
        }

        System.out.println("Salimos del bucle...");
    }
}