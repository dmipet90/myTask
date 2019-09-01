import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Run {

    public static void main(String[] args) {
        try {
            String path = System.getProperty("user.dir");

            BufferedReader file1 = new BufferedReader(new FileReader(path + "/src/file1.txt"));
            BufferedReader file2 = new BufferedReader(new FileReader(path + "/src/file2.txt"));
            BufferedReader file3 = new BufferedReader(new FileReader(path + "/src/file3.txt"));
            BufferedReader file4 = new BufferedReader(new FileReader(path + "/src/file4.txt"));

            Figure test1 = new Figure();
            Figure test2 = new Figure();
            Figure test3 = new Figure();
            Figure test4 = new Figure();

            test1.fileInput(file1);
            test2.fileInput(file2);
            test3.fileInput(file3); // shows 15 variations of correct figure
            test4.fileInput(file4);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
