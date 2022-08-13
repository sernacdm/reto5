/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casacampestre.model.dao;

import com.mycompany.casacampestre.model.vo.AsesorPorCiudadVo;
import com.mycompany.casacampestre.ulti.JDBCUtilies;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class AsesorPorCiudadDao {
    public ArrayList<AsesorPorCiudadVo> listar() throws SQLException{
        ArrayList<AsesorPorCiudadVo> resultado = new ArrayList<AsesorPorCiudadVo>();
        Connection conn = JDBCUtilies.gConnection();
        
        try {
            String sql= "SELECT l.ID_Lider, l.Nombre, l.Primer_Apellido,l.Ciudad_Residencia FROM Lider l ORDER BY l.Ciudad_Residencia;";
            
            
            Statement stmt = conn.createStatement();
            ResultSet rs =  stmt.executeQuery(sql);
            
            while(rs.next()){
                AsesorPorCiudadVo asesor =  new AsesorPorCiudadVo(
                        rs.getInt("ID_Lider"),
                        rs.getString("Nombre"),
                        rs.getString("Primer_Apellido"),
                        rs.getString("Ciudad_Residencia")
                );
                resultado.add(asesor);
            }
            rs.close();
            stmt.close();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
        return resultado;
    }
    
}
