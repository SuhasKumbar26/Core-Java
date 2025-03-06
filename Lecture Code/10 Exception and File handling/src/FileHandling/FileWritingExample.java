package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritingExample {
    public static void main(String[] args) {

        String fileName = "10 Exception and File Handling/src/FileHandling/JavaDev.txt";
           //Try with Resource
        try(FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello java \ndevelopers...🌱");

            writer.flush();
            System.out.println("File written successfully");
        } catch (IOException e){
            System.out.printf("Exception Occurred %s\n",e.getMessage());
        }
    }
}
