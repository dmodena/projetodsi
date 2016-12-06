/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.bd;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp.BasicDataSource;

/**
 *
 * @author Doug Modena
 */
public class ConexaoBD {
    private static ConexaoBD instance;
    
    private BasicDataSource dataSource;
    private String user = "projetodenis";
    private String pass = "projetodenis";
    private String driver = "oracle.jdbc.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:XE";
    
    private ConexaoBD() {
        dataSource = new BasicDataSource();
        dataSource.setUsername(user);
        dataSource.setPassword(pass);
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
    }
    
    public static ConexaoBD getInstance() {
        return instance == null ? new ConexaoBD() : instance;
    }
    
    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
    
    public BasicDataSource getDataSource() {
        return dataSource;
    }
}
