package Practical_3.ge.edu.btu.chat.server;

import java.io.ObjectInputStream;
import java.net.Socket;

public class ServerThread extends Thread {

    private Socket client;

    public ServerThread(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {

        try {
            while (true) {
                ObjectInputStream objectInputStream = new ObjectInputStream(client.getInputStream());
                String str = (String) objectInputStream.readObject();
                System.out.println("მიღებული შეტყობინებაა : " + str);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
