import java.io.FileNotFoundException;
import java.io.IOException;

public class FileException {
    public static void main(String[] args) {

        try {
            String x = "abc";
            if (x.equals("abc")) {
                throw new IOException();
            } else {
                throw new FileNotFoundException();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

