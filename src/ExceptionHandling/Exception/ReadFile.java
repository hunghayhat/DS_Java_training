package ExceptionHandling.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
    static void readFile() throws FileNotFoundException {
        try {
            FileReader file = new FileReader("../data.txt");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: ../data.txt");
            throw e; // Ném lại ngoại lệ
        }
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
