/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ieu.rmi.servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Mireille Betancourt
 */
public interface HelloInterface {
    
    String say() throws RemoteException;
    
}
