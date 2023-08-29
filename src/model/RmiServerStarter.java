package model;


import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;
import interfaces.ServerFunctions;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RmiServerStarter {
    private final String registryName;
    private final int port;
    private Registry registry;
    private ServerFunctions server;

    public RmiServerStarter(String registryName, int port) {
        this.registryName = registryName;
        this.port = port;
    }

    public void startRmiServer() {
        try {
            // Crear una instancia de la implementación del servidor
            server = new RmiServiceImplementation();

            // Crear el registro RMI en el puerto especificado
            registry = LocateRegistry.createRegistry(port);

            // Registrar la instancia del servidor en el registro RMI con el nombre especificado
            registry.rebind(registryName, server);

            // Mostrar mensaje de confirmación
            JOptionPane.showMessageDialog(null, "Servidor Remoto Iniciado en el puerto " + port);
        } catch (RemoteException e) {
        }
    }

    public void stopRmiServer() throws NotBoundException {
        try {
            if (registry != null) {
                registry.unbind(registryName);
            }
            UnicastRemoteObject.unexportObject(server, true);
            JOptionPane.showMessageDialog(null, "Servidor Remoto Detenido");
        } catch (RemoteException e) {
        }
    }
}
