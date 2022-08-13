/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casacampestre.controller;

import com.mycompany.casacampestre.model.dao.AsesorPorCiudadDao;
import com.mycompany.casacampestre.model.dao.ComprarPorProveedorDao;
import com.mycompany.casacampestre.model.dao.ProyectoCasaCampresteDao;
import com.mycompany.casacampestre.model.vo.AsesorPorCiudadVo;
import com.mycompany.casacampestre.model.vo.CompraPorProveedorVo;
import com.mycompany.casacampestre.model.vo.ProyectoCasaCampestreVo;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class RequerimientoController {
    private final AsesorPorCiudadDao asesorPorCiudadDao;
    private final ProyectoCasaCampresteDao proyectoCasaCampresteDao;
    private final ComprarPorProveedorDao comprarPorProveedorDao;
    
    public RequerimientoController(){
        asesorPorCiudadDao = new AsesorPorCiudadDao();
        proyectoCasaCampresteDao = new ProyectoCasaCampresteDao();
        comprarPorProveedorDao = new ComprarPorProveedorDao() ;
    }
    
    public ArrayList<AsesorPorCiudadVo> consultarAsesorPorCiudad() throws SQLException{
        return asesorPorCiudadDao.listar();
    }  
    
    public ArrayList<ProyectoCasaCampestreVo> consultarProyectoCasaCampreste() throws SQLException{
        return proyectoCasaCampresteDao.listar();
    } 
    
    public ArrayList<CompraPorProveedorVo> consultarComprarPorProveedor() throws SQLException{
        return comprarPorProveedorDao.listar();
    } 
    
    
    
}
