import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Run {

    public static void main(String[] args) {
        try {
            String path = System.getProperty("user.dir");
            BufferedReader file = new BufferedReader(new FileReader(path + "/src/input.txt"));
            Figure figure = new Figure();
            figure.fileInput(file);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
