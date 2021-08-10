/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ieu.rmi.servidor;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Mireille Betancourt
 */
public class HelloResgistryServer {
    
    public static void main(String[] args){
            try {
                Registry registry = LocateRegistry.createRegistry(1099); //default port 1099
                registry.rebind("Hello", new HelloImp("¡Éxito!"));
    }catch(Exception ex){
        System.out.println("Servidor no conectado: " + ex);
        ex.printStackTrace();
        }
    }
}

