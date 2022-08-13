/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casacampestre.model.dao;

import com.mycompany.casacampestre.model.vo.CompraPorProveedorVo;
import com.mycompany.casacampestre.model.vo.ProyectoCasaCampestreVo;
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
public class ComprarPorProveedorDao {
      
    public ArrayList<CompraPorProveedorVo> listar() throws SQLException{
        ArrayList<CompraPorProveedorVo> resultado = new ArrayList<CompraPorProveedorVo>();
        Connection conn = JDBCUtilies.gConnection();
        
        try {
            String sql= "SELECT c.ID_Compra, p.Constructora , p.Banco_Vinculado \n" +
"FROM Compra c\n" +
"JOIN Proyecto p ON (c.ID_Proyecto = p.ID_Proyecto)\n" +
"WHERE p.Ciudad = 'Salento' AND c.Proveedor= 'Homecenter';";

            Statement stmt = conn.createStatement();
            ResultSet rs =  stmt.executeQuery(sql);
            
            while(rs.next()){
                CompraPorProveedorVo compra =  new CompraPorProveedorVo(
                        rs.getInt("ID_Compra"),
                        rs.getString("Constructora"),
                        rs.getString("Banco_Vinculado")
                );
                resultado.add(compra);
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
