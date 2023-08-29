
package server;
    
import interfaces.Server;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;


public class testServerRMI {
    public static void main(String[] args)  {
        try{
            //creamos una instancia de la interface la cual recibe una intancia de la clase servidor
            Server server = new ServerRMI();
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("MiObjetoRemoto", server);
        System.out.println("Servidor Remoto Iniciado");
        } catch(RemoteException e){
        }
        
        
        
        
       
    }
}
