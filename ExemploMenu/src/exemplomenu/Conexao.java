/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplomenu;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author marcelo
 */
public class Conexao {
    
    Connection c;
    
    public Connection conecta(){
        
        String user;
        String password;
        String port;
        String host;
        String base;
        String url;
        
        user="root";
        password="usbw";
        port="3307";
        host="localhost";
        base="test";
        
        url="jdbc:mysql://"+host+":"+port+"/"+base;
        try {
            c = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("Erro "+e.getMessage());
        }
        
       
        
        
        return c;
    }
    
}
