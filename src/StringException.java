import java.lang.StringIndexOutOfBoundsException;
public class StringException{


    public static void main(String[] args) {


        String string = "123";
        try {
            char chr = string.charAt(10);
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println(ex.toString());
        }
        System.out.println("Конец программы!");
    }
}