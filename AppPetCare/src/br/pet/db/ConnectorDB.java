
package br.pet.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author vitor
 */
public class ConnectorDB {

    static Object getConnector() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String url = "jdbc:mysql://localhoste:3306//petcare";
    private String username = "petcare";
    private String password = "petcare";
    
    
    public Connection getConnection()throws SQLExpection, SQLException{
        return DriverManager.getConnection(url, url, password);
    }
}
