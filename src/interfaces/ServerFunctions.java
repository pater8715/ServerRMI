package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import model.ProductModel;

public interface ServerFunctions extends Remote {

    public String consultar(int id) throws RemoteException;

    public ArrayList<String> listEmpleados() throws RemoteException;
    
    public ProductModel obtenerPorId(int id) throws RemoteException;
    
    public List<ProductModel> obtenerLista() throws RemoteException;
    
}
