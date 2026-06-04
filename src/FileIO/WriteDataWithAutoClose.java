package FileIO;

import java.io.File;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception {

        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }





        try (
                // Create a file
                PrintWriter output = new PrintWriter(file);
        ) {
            // Write formatted output to the file
            output.print("John T. Perez ");
            output.println(90);
            output.print("Jamal K. Johnson ");
            output.println(85);
        }
    }
}
