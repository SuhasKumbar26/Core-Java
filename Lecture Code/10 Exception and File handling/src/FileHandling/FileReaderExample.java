package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String fileName = "10 Exception and File Handling/src/FileHandling/JavaDev.txt";
        try(FileReader reader = new FileReader(fileName)){
            int reading = 0;

            do{
                reading = reader.read();
                System.out.print((char) reading);
            } while (reading != -1);

        } catch (IOException exception){
            System.out.printf("Exception occurred %s",exception.getMessage());
        }
    }
}
