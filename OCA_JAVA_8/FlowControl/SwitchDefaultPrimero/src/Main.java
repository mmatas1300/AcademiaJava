class Main{
    public static void main(String[] args) {
        String fruit = "mango";

        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
            case "apple":
                System.out.println("APPLE");
            case "mango":
                System.out.println("MANGO");
            case "banana":
                System.out.println("BANANA");
                break;
        }
    }
}