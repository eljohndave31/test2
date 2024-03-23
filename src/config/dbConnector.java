package config;

import java.sql.*;
import javax.swing.JOptionPane;

public class dbConnector {
    
    final private Connection cn;
    
    public dbConnector() throws SQLException{
        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","");
    }
    
    public ResultSet getData(String sql) throws SQLException{
           return cn.createStatement().executeQuery(sql);
    }
    
}