/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.sql.*;

/**
 *
 * @author NGUYEN THI MINH ANH
 */
public class LoginBean implements Serializable {

    public LoginBean() {
    }

    public boolean checkLogin(String username, String password) throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433:databasename=FU_MVC;User=sa;Password=123456";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "select * from Registration where username= ? and password= ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            boolean result = rs.next();
            rs.close();
            stm.close();
            con.close();
            if (result) {
                return true;
            }
        } catch (ClassNotFoundException ex) {
        }
        return false;
    }
}
