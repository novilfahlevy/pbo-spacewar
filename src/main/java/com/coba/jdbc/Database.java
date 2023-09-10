/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coba.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author novil
 */
public class Database {
    protected Connection connection = null;
    protected Statement statement;
    protected ResultSet resultSet;
    protected PreparedStatement preparedStatement;
    
    public Database() {
        try {
            String url = "jdbc:mysql://localhost/pbo_perpustakaan";
            String username = "root";
            String password = "";
            
            this.connection = DriverManager.getConnection(url, username, password);
            
            this.preparedStatement = this.connection.prepareStatement("DELETE FROM member WHERE id = ?");
            
            this.preparedStatement.setInt(1, 20);
            
            int result = this.preparedStatement.executeUpdate();
            
            if (result > 0) {
                System.out.println("Member berhasil dihapus.");
            }
            
            this.closeConnection();
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
    
    protected final void closeConnection() {
        try {
            if (this.resultSet != null) this.resultSet.close();
            if (this.statement != null) this.statement.close();
            if (this.preparedStatement != null) this.preparedStatement.close();
            if (this.connection != null) this.connection.close();
            
            this.resultSet = null;
            this.statement = null;
            this.preparedStatement = null;
            this.connection = null;
        } catch (SQLException ex) {}
    }
}
