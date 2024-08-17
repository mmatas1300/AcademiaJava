//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class App {
    App() {
        System.out.println("1");
    }
    App(Integer num) {
        System.out.println("3");
    }
    App(Object num) {
        System.out.println("4");
    }
    App(int num1, int num2, int num3) {
        System.out.println("5");
    }
    public static void main(String[] args) {
        new App(100);
        new App(100L);
    }
}