/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casacampestre.ulti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class JDBCUtilies {
    //private static final String UBICACION_DB ="jdbc:sqlite:C:\\slqlite\\hr.db";
    private static final String UBICACION_DB ="C:\\slqlite\\db\\ProyectosConstruccion.db";
    
    public static Connection gConnection() throws SQLException{
        String url = "jdbc:sqlite:"+UBICACION_DB;
        return DriverManager.getConnection(url);
    }
}
