import java.text.NumberFormat;
import java.text.ParseException;

public class App {
    App(){
        System.out.println("1");
    }
    App(int num){
        System.out.println("2");
    }
    App(Integer num){
        System.out.println("3");
    }
    App(Object num){
        System.out.println("4");
    }
    public static void main(String[] args) throws ParseException {
        String[] sa = {"333.6789","234.111"};
        NumberFormat inf= NumberFormat.getInstance();
        inf.setMaximumFractionDigits(2);
        for(String s:sa){
            System.out.println(inf.format(inf.parse(s)));
            
        }
    }
}