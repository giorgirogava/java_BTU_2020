package Practical_3.ge.edu.btu.chat.server;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        ServerThread serverThread;
        ServerSocket serverSocket;
        Socket socket = null;
        ObjectInputStream objectInputStream;

        try {

            serverSocket = new ServerSocket(9080);

            while (true) {
                System.out.println("მიმდინარეობს კავშირის დამყარება ... ");
                socket = serverSocket.accept();
                serverThread = new ServerThread(socket);
                serverThread.start();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
