
package br.pet.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author vitor
 */
public class ConnectorDB {

    private String url = "jdbc:mysql://localhost:3306/bd_petcare";
    private String username = "petcare";
    private String password = "petcare";
    
    
    public Connection getConnection()throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
    }
}  