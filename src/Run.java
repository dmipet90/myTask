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

/*
Output:

file1.txt

5 7 4 4
3 4 1 3
8 3 3 4
3 1 1 4
4 2 4 2
5 1 1 4
7 1 5 4
4 1 1 0
1 0 7 5
7 6 1 8
5 1 1 7
2 4 3 8

file2.txt

0 7 7 3
3 7 1 2
8 0 5 1
3 2 0 4
4 4 3 6
4 0 3 3
5 4 6 0
5 0 5 2
3 0 4 3
1 7 3 8
5 1 0 7
3 4 3 0

file3.txt

6 5 5 4
4 1 3 5
5 1 4 2
4 0 5 2
3 0 4 5
4 6 0 1
6 1 3 5
2 0 1 4
4 0 5 1
5 2 1 4
4 0 4 6
1 6 4 0

6 5 5 4
4 1 3 5
5 1 4 2
4 0 5 2
3 0 4 5
5 2 1 4
6 1 3 5
2 0 1 4
4 0 5 1
4 6 0 1
4 0 4 6
1 6 4 0

3 0 4 5
4 6 0 1
4 0 5 1
4 0 4 6
5 2 1 4
6 5 5 4
4 0 5 2
5 1 4 2
2 0 1 4
1 6 4 0
4 1 3 5
6 1 3 5

6 1 3 5
4 6 0 1
5 1 4 2
4 0 4 6
5 2 1 4
6 5 5 4
4 0 5 1
4 1 3 5
2 0 1 4
1 6 4 0
3 0 4 5
4 0 5 2

6 1 3 5
4 6 0 1
4 0 5 1
4 0 4 6
5 2 1 4
6 5 5 4
5 1 4 2
4 1 3 5
2 0 1 4
1 6 4 0
3 0 4 5
4 0 5 2

2 0 1 4
4 6 0 1
4 0 5 2
6 1 3 5
5 2 1 4
6 5 5 4
4 0 5 1
5 1 4 2
3 0 4 5
1 6 4 0
4 0 4 6
4 1 3 5

1 6 4 0
4 6 0 1
4 0 5 2
6 5 5 4
5 1 4 2
6 1 3 5
4 0 5 1
3 0 4 5
2 0 1 4
5 2 1 4
4 0 4 6
4 1 3 5

6 1 3 5
4 6 0 1
5 1 4 2
4 0 4 6
5 2 1 4
6 5 5 4
4 0 5 1
4 0 5 2
3 0 4 5
1 6 4 0
2 0 1 4
4 1 3 5

6 1 3 5
4 6 0 1
4 0 5 1
4 0 4 6
5 2 1 4
6 5 5 4
5 1 4 2
4 0 5 2
3 0 4 5
1 6 4 0
2 0 1 4
4 1 3 5

1 6 4 0
4 0 4 6
4 0 5 2
6 1 3 5
5 2 1 4
2 0 1 4
5 1 4 2
4 0 5 1
4 1 3 5
4 6 0 1
3 0 4 5
6 5 5 4

1 6 4 0
4 0 5 2
5 1 4 2
4 0 4 6
5 2 1 4
4 6 0 1
4 0 5 1
4 1 3 5
2 0 1 4
6 5 5 4
6 1 3 5
3 0 4 5

6 1 3 5
4 6 0 1
6 5 5 4
2 0 1 4
5 2 1 4
4 0 5 1
4 0 5 2
5 1 4 2
4 0 4 6
1 6 4 0
4 1 3 5
3 0 4 5

6 1 3 5
4 6 0 1
6 5 5 4
2 0 1 4
5 2 1 4
4 0 5 2
4 0 5 1
5 1 4 2
4 0 4 6
1 6 4 0
4 1 3 5
3 0 4 5

6 1 3 5
4 6 0 1
4 0 5 2
4 0 4 6
5 2 1 4
6 5 5 4
4 0 5 1
4 1 3 5
2 0 1 4
1 6 4 0
5 1 4 2
3 0 4 5

6 1 3 5
4 6 0 1
5 1 4 2
4 0 4 6
5 2 1 4
6 5 5 4
4 0 5 2
4 1 3 5
2 0 1 4
1 6 4 0
3 0 4 5
4 0 5 1

file4.txt

5 2 2 2
5 5 1 4
3 2 6 1
4 3 3 4
4 2 2 3
4 5 3 4
4 1 3 5
5 2 1 3
2 1 3 3
3 3 3 4
3 3 7 4
1 2 5 3

*/
