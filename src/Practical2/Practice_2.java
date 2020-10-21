package Practical2;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;
import java.util.logging.Logger;

public class Practice_2 {


    public static boolean Find(File file, String searchKey) {

//        final Logger logger2 = Logger.getLogger(String.valueOf(Practice_2.class));
//        File[] list = file.listFiles();


        int i = 0;
        String[] filePathArr = file.getAbsolutePath().split("/");
        String filePath = filePathArr[i];


        while (true) {

            File file1 = new File(filePath);
            if (file1.isDirectory()) {
                filePath += filePathArr[++i];

            } else return file1.isFile();
        }

    }


    public static void main(String[] args) {

        System.out.println("შემოიტანე საძიებო სიტყვა: ");
        Scanner scanner = new Scanner(System.in);
        String inputFileName = scanner.nextLine();

        File file = new File("C:\\Windows\\System32");

        String[] fileNames = file.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {

                final Logger logger = Logger.getLogger(String.valueOf(Practice_2.class));

                if (name.toLowerCase().startsWith(inputFileName.toLowerCase()) && dir.exists()) {
                    logger.info("    -   " + "მოიძებნა " + name);
                    return true;
                } else {
                    return false;
                }
            }
        });

//        File[] list = file.listFiles();

//        for (String fileName : fileNames) {
//            System.out.println(fileName);
//        }


    }
}





