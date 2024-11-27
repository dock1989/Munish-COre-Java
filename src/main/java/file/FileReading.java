package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) throws IOException {
        File file = new File("FirstFile.txt");
        if(file.createNewFile())
            System.out.println("New File created");
        else
            System.out.println("File already exists");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        while(bufferedReader.read() > 0)
        System.out.println(bufferedReader.readLine());

    }
}
