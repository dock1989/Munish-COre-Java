package file;

import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;

public class FileIntro {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("test2.txt");
        if(file.createNewFile())
            System.out.println("File created successfully");
        else
            System.out.println("File already exists");
        // File Writing
//        System.out.println("Enter any data and type EXIT to terminate");
//
//        String a = scanner.nextLine();
//
//        FileWriter fileWriter = new FileWriter(file,true);
//        while(!a.equalsIgnoreCase("EXIT")) {
//            fileWriter.write("\n"+a);
//            a= scanner.nextLine();
//        }
//        fileWriter.close();
//        scanner.close();

        //File Reading
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String data;
        while ((data = bufferedReader.readLine()) != null)
            System.out.println(data);
            data = bufferedReader.readLine();

        bufferedReader.close();

    }
}
