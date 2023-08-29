package model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import interfaces.ServerFunctions;

public class RmiServiceImplementation extends UnicastRemoteObject implements ServerFunctions {

    private ArrayList<Persona> listPersona() {
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Persona(1, "juan", "jp@gmail.com", "administrador", "35000"));
        lista.add(new Persona(2, "Carlos", "cp@gmail.com", "administrador", "500000"));
        return lista;
    }
    
    

    public RmiServiceImplementation() throws RemoteException {
        
    }

    private String getPernona(int id) {
        return "Nombre: " + listPersona().get(id).getNombre();
    }

    @Override
    public String consultar(int id) throws RemoteException {
        if (id < listPersona().size()) {
            return getPernona(id);
        } else {
            return "No existen los datos del Empleado";
        }
    }

    @Override
    public ArrayList<String> listEmpleados() throws RemoteException {
        ArrayList<String> list = new ArrayList<>();
        for(Persona p : listPersona()){
            System.out.println(p.getNombre());
            list.add(p.getNombre());
        }
        return list;
    }

    @Override
    public ProductModel obtenerPorId(int id) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); 

    }

    @Override
    public List<ProductModel> obtenerLista() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); 
        
    }

}
