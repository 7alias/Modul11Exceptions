import java.text.NumberFormat;
import java.text.ParseException;

public class NumberFormatEx {

    public static void main(String[] args) {

        try {
            NumberFormat nf = NumberFormat.getInstance();
            //create case which will lead to exception

            System.out.println(nf.parse("NOT A NUMBER"));

        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End of program");
    }
}
