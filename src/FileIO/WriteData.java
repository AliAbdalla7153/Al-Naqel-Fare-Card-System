package FileIO;

import java.io.File;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws java.io.IOException {
        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        // Create a file
          PrintWriter output = new PrintWriter(file);

        // Write formatted output to the file
        output.println("Taha");
        output.println(90);
        output.println("Jamal");
        output.println(85);

        // Close the file
        output.close();
    }
}
