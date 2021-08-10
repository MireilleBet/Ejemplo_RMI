/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ieu.rmi.servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author Mireille Betancourt
 */
public class HelloImp extends UnicastRemoteObject implements HelloInterface{
    private String message; 
    
    protected HelloImp() throws RemoteException {
        super();
   }
    
    public HelloImp(String msg) throws RemoteException{
        this.message = msg;        
    }

   @Override
   public String say() throws RemoteException {
      return null;

   }
}
