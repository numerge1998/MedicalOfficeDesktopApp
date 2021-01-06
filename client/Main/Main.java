package client;

//import view.Interfata;

import server.ContUtilizator;
import server.Pacient;
import server.PersistentaContUtilizator;
import server.PersistentaPacient;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new Interfata();

    }
}
