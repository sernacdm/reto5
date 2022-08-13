/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casacampestre.model.dao;


import com.mycompany.casacampestre.model.vo.AsesorPorCiudadVo;
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
public class ProyectoCasaCampresteDao {
    public ArrayList<ProyectoCasaCampestreVo> listar() throws SQLException{
        ArrayList<ProyectoCasaCampestreVo> resultado = new ArrayList<ProyectoCasaCampestreVo>();
        Connection conn = JDBCUtilies.gConnection();
        
        try {
            String sql= "SELECT p.ID_Proyecto, p.Constructora, p.Numero_Habitaciones,p.Ciudad FROM Proyecto p  WHERE p.Ciudad IN ('Santa Marta','Cartagena','Barranquilla') AND p.Clasificacion = 'Casa Campestre';";

            Statement stmt = conn.createStatement();
            ResultSet rs =  stmt.executeQuery(sql);

            while(rs.next()){
                ProyectoCasaCampestreVo casas =  new ProyectoCasaCampestreVo(
                        rs.getInt("ID_Proyecto"),
                        rs.getString("Constructora"),
                        rs.getDouble("Numero_Habitaciones"),
                        rs.getString("Ciudad")
                );
                resultado.add(casas);
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
