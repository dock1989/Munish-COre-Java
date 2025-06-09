package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SimpleFileExm {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("test090625.txt");
        if(file.createNewFile())
            System.out.println("File created successfully");
        else
            System.out.println("File already exists");


//        java.io.FileWriter fileWriter = new java.io.FileWriter(file,true);
//        System.out.println("Enter data");
//        String a = scanner.nextLine();
//        while (!a.equalsIgnoreCase("EXIT")){
//        fileWriter.write(a+"\n");
//        a=scanner.nextLine();
//        }
//
//
//        fileWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String data;
        while ((data = bufferedReader.readLine()) != null) {
            System.out.println(bufferedReader.readLine());
        }



    }
}
