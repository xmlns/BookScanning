import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\akulkar5\\Downloads\\a_example.txt";
        inputFilePath = inputFilePath.replace("\\", "/");
        try {
            Scanner scanner = new Scanner(new File(inputFilePath));
            // Line 1: No. of books (B), no. of libraries (L), no. of days (D)
            String[] booksLibsDays = scanner.nextLine().split(" ");
            // Line 2: Scores of books
            String[] bookScores = scanner.nextLine().split(" ");
            //Following are L sections [with 2 lines per section (L*2 lines)] of input
            String[] libraryParams;
            int noOfLibraries = Integer.parseInt(booksLibsDays[1]);
            List<Library> libraries = new ArrayList<>(noOfLibraries);
            String[] libraryBookIds;
            while (noOfLibraries > 0) {
                // Line 3,5,7,..: No. of books, no. of days for signup, no. of books/day it can ship
                libraryParams = scanner.nextLine().split(" ");
                Library library = new Library(Integer.parseInt(libraryParams[0]), Integer.parseInt(libraryParams[1]),
                        Integer.parseInt(libraryParams[2]));
                // Line 4,6,8,..: book IDs
                libraryBookIds = scanner.nextLine().split(" ");
                library.setBookIds(libraryBookIds);
                libraries.add(library);
                noOfLibraries--;
            }
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        }
    }
}
