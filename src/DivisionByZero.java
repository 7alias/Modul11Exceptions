import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;

public class DivisionByZero extends MyException{
    public DivisionByZero(int detail, String message) {
        super(detail, message);
    }

    public static void main(String[] args) {
        DivisionByZero div = new DivisionByZero(args.length, " / zero");
        div.doAction();
    }

    public void doAction() {
        try {
            int a = (int) (Math.random() * 2);
            System.out.println("a = " + a);
            int c[] = {1 / a};
            c[a] = 71;

        } catch (ArithmeticException e) {
            System.err.println("деление на 0" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("out of bound" + e);
        }//end try/catch
        System.out.println("after try-catch");
    }
}

