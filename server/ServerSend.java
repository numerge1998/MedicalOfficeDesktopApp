package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSend {
    
    public void socketSend() throws IOException {
        ServerSocket ss = new ServerSocket(7777);
        Socket socket;
        System.out.println("[Serv]ServerSocket awaiting connections...");
        while (true) {
            socket = ss.accept(); // blocking call, this will wait until a connection is attempted on this port.
            System.out.println("Connection from " + socket + "!");

            OutputStream outputStream = socket.getOutputStream();
            // create an object output stream from the output stream so we can send an object through it
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            // read the list of messages from the socket
            System.out.println("Sending messages to the ServerSocket");


            objectOutputStream.writeObject(new PersistentaContUtilizator());
            objectOutputStream.writeObject(new PersistentaPacient());
            objectOutputStream.writeObject(new PersistentaProgram());
            objectOutputStream.writeObject(new PersistentaProgramDoc());
            objectOutputStream.writeObject(new PersistentaUtilizator());
            if(1 == 2)break;
        }

        System.out.println("Closing socket and terminating program.");
        ss.close();
        socket.close();
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // don't need to specify a hostname, it will be the current machine
        ServerSend serv = new ServerSend();
        serv.socketSend();
    }
}
