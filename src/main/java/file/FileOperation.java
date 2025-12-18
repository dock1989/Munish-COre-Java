package file;

import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;

public class FileOperation {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("example2.txt");
        if(file.createNewFile()){
            System.out.println("New file created");
        }
        else {
            System.out.println("File already present");
        }
        // Writing in the file
//        System.out.println("Enter something in the file");
//        String b = scanner.nextLine();
//        FileWriter fileWriter = new FileWriter(file,true);
//        while (!b.equals("Exit")){
//          fileWriter.write(b + "\n");
//            System.out.println("Enter anything");
//          b = scanner.nextLine();
//        }
//        fileWriter.close();

        //Reading from the file


        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();

    }
}
