package file;

import util.ScannerUtil;

import java.io.File;
import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("FirstFile.txt");
        if(file.createNewFile())
            System.out.println("New File created");
        else
            System.out.println("File already exists");


        System.out.println("Enter anything in the file");
        String a = ScannerUtil.takeInput().nextLine();
        java.io.FileWriter fileWriter = new java.io.FileWriter(file,true);
        fileWriter.write(a);
        fileWriter.close();

    }
}
