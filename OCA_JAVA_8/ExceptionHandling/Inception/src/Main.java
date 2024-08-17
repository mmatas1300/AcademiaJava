public class Main{
    public static void main(String[] args) {
        Course c = new Course();
        c.name="java";
        System.out.println(c.name);
    }
}

class Course {
    String name;
    Course(){
        Course c = new Course();
        c.name="Oracle";
    }
}