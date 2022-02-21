import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("files/borodino.txt"), UTF_8);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number in range 1.." + lines.size());
        int n = 1;
        try {
            while (n > 0 && n <= lines.size()) {
                n = in.nextInt();
                System.out.println("This is a prediction for you:\n" + lines.get(n - 1));
            }
        } catch (Exception e) {
            System.out.println("Вы ввели недопустимый номер...");

        }
    }
}

