package main;


import model.RmiServerStarter;

/**
 *
 * @author Alberto Paternina
 */
public class Principal {

    public static void main(String[] args) {
        String registryName = "RMIServiceRegistry";
        RmiServerStarter server;
        server = new RmiServerStarter(registryName, 1099);
        server.startRmiServer();
    }
}
