import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;


public class Figure {
    // Input method
    public void fileInput(BufferedReader input) throws IOException {

        ArrayList<Square> figure = new ArrayList<>();
        String line = input.readLine();
        int count = 0;

        // Read each line of file
        while(line != null) {
            count++;
            if (!line.isEmpty()) {
                line = line.replaceAll("\\s", ""); // e.g from 1 2 3 to 123
                if (line.length() == 4) {

                    // Add Square objects to list
                    figure.add(new Square(Character.getNumericValue(line.charAt(0)),
                            Character.getNumericValue(line.charAt(1)),
                            Character.getNumericValue(line.charAt(2)),
                            Character.getNumericValue(line.charAt(3))));
                } else {
                    throw new IOException("Error! Incorrect input format");
                }
            }

            // Read next line
            line = input.readLine();
        }

        if (count != 12) {
            throw new IOException("Error! Incorrect input format");
        } else {
            input.close();
            this.permuteSquares(figure, figure.size());
        }
    }


    private void permuteSquares(ArrayList<Square> figure, int n) {
        if (this.checkFigure(figure, n)) {

            // Print correct results in console
            if (n == 1) {
                figure.forEach((square) -> System.out.println(square.getTopLeft() + " " + square.getTopRight() + " " + square.getBottomLeft() + " " + square.getBottomRight() + " "));
                System.out.println();
            } else {

                // Squares permutations
                for(int i = 0; i < n; ++i) {
                    this.replaceSquares(figure, i, n - 1);
                    this.permuteSquares(figure, n - 1);
                    this.replaceSquares(figure, i, n - 1);
                }
            }
        }

    }

    // Replace squares
    private void replaceSquares(ArrayList<Square> figure, int i, int n) {
        Square tmp = figure.get(i);
        Square b = figure.get(n);
        figure.set(i, b);
        figure.set(n, tmp);
    }

    // Sum of four square corners
    private int fourCornerSum(Square br, Square bl, Square tl, Square tr) {
        return br.getBottomRight() + bl.getBottomLeft() + tl.getTopLeft() + tr.getTopRight();
    }

    // Check correctness of figure
    private boolean checkFigure(ArrayList<Square> figure, int n) {
        int correctValue = 10;
        if ((n != 1 || figure.get(0).getTopRight() + figure.get(1).getTopLeft() <= correctValue) &&
        (n != 1 || figure.get(0).getBottomLeft() + figure.get(3).getTopLeft() + figure.get(2).getTopRight() <= correctValue) &&
        (n != 1 || this.fourCornerSum(figure.get(0), figure.get(1), figure.get(4), figure.get(3)) == correctValue) &&
        (n != 1 || figure.get(1).getBottomRight() + figure.get(4).getTopRight() + figure.get(5).getTopLeft() <= correctValue) &&
        (n != 2 || figure.get(2).getBottomLeft() + figure.get(6).getTopLeft() <= correctValue) &&
        (n != 2 || this.fourCornerSum(figure.get(2), figure.get(3), figure.get(7), figure.get(6)) == correctValue) &&
        (n != 3 || this.fourCornerSum(figure.get(3), figure.get(4), figure.get(8), figure.get(7)) == correctValue) &&
        (n != 4 || this.fourCornerSum(figure.get(4), figure.get(5), figure.get(9), figure.get(8)) == correctValue) &&
        (n != 5 || figure.get(5).getBottomRight() + figure.get(9).getTopRight() <= correctValue) &&
        (n != 6 || figure.get(6).getBottomRight() + figure.get(7).getBottomLeft() + figure.get(10).getTopLeft() <= correctValue) &&
        (n != 7 || this.fourCornerSum(figure.get(7), figure.get(8), figure.get(11), figure.get(10)) == correctValue) &&
        (n != 8 || figure.get(9).getBottomLeft() + figure.get(8).getBottomRight() + figure.get(11).getTopRight() <= correctValue) &&
        (n != 10 || figure.get(10).getBottomRight() + figure.get(11).getBottomLeft() <= correctValue)) {
            return true;
        } else {
            return false;
        }
    }
}
