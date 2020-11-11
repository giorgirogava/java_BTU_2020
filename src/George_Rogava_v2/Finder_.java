package George_Rogava_v2;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;


class TestThread extends Thread {

    @Override
    public void run() {

        File file = new File("E:\\Semester_5\\java\\BTU_DOCUMENT\\");
        String[] fileNames = file.list();

        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            assert fileNames != null;
            System.out.println(fileNames.length);
        }
    }

}


public class Finder_ {
    public static void main(String[] args) {


        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("შემოიტანე საძიებო სიტყვა: ");

            String inputFileName = scanner.nextLine();

            System.out.println("შემოტანილი სიტყვაა: " + inputFileName);

            File file = new File("E:\\Semester_5\\java\\BTU_DOCUMENT\\");

            String[] fileNames = file.list(new FilenameFilter() {

                @Override
                public boolean accept(File dir, String name) {

                    final Logger logger = Logger.getLogger(String.valueOf(Finder_.class));

                    if (name.toLowerCase().startsWith(inputFileName.toLowerCase()) && dir.exists()) {
                        logger.info("    -   " + "მოიძებნა " + name);
                        return true;
                    } else {
                        return false;
                    }
                }
            });


            TestThread thred_1 = new TestThread();
            thred_1.start();

            // waiting thread
        }

    }
}
