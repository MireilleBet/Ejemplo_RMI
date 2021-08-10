/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ieu.rmi.cliente;

import edu.ieu.rmi.servidor.HelloInterface;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mireille Betancourt
 */
public class HelloClienteRMI {
    
    public static void main(String[] args){
        try {
            HelloInterface hello = (HelloInterface) Naming.lookup("//localhost/Hello");
            System.out.println("Mensaje del RMI hello.say= " +
                    hello.say());
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(HelloClienteRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
