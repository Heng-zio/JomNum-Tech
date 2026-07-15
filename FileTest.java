import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File object = new File("Hello.txt");

        try {
            // 1. Check if the file can be created fresh
            if (object.createNewFile()) {
                System.out.println("File created successfully!");
                
                // 2. Open the writer ONLY after confirming it's a new file
                FileWriter myWriter = new FileWriter(object);
                myWriter.write("Files in Java might be tricky, but it is fun enough!");
                myWriter.close(); // Always close your streams!
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}