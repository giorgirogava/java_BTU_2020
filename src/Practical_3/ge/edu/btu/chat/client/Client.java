package Practical_3.ge.edu.btu.chat.client;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Socket socket;
        ObjectOutputStream objectOutputStream = null;
        boolean b = true;

        try {

            socket = new Socket("localhost", 9080);
            System.out.println("მიმდინარეობს კავშირის დამყარება ...");
            System.out.println("დასვი კითხვა: ");

            while (b) {
                objectOutputStream = new ObjectOutputStream(socket.getOutputStream());

                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();

                objectOutputStream.writeObject(input);

                if (input.equals("მაჩვენე კურსი")) {
                    System.out.println("პასუხი: " + "2.97");
                    System.out.println("დასვი კითხვა: ");
                } else if (input.equals("მაჩვენე ფილიალები")) {
                    System.out.println("ი.ჭავჭავაძის გამზ, ვაჟა-ფშაველას გამზ, გურამიშვილის გამზ.");
                    System.out.println("დასვი კითხვა: ");
                } else {
                    System.out.println("სამწუხაროდ ამ კითხვაზე პასუხი არ მაქვს.");
                    System.out.println("დასვი კითხვა: ");
                }

            }

            objectOutputStream.close();
            socket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}