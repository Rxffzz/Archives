package usingFiles;

import java.io.File;
import java.util.Scanner;

public class Folders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Training.Folders: ");
        for (File f : folders){
            System.out.println(f);
        }

        File[] files = path.listFiles(File::isFile);

        System.out.println("Training.Files: ");
        for (File f : files){
            System.out.println(f);
        }

        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);

        sc.close();
    }
}
