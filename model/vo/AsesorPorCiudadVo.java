/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casacampestre.model.vo;

/**
 *
 * @author pc
 */
public class AsesorPorCiudadVo {
    
    private Integer idLider;
    private String nombre;
    private String primerApellido;
    private String ciudadResidencia;
    
    public AsesorPorCiudadVo(){
        
    }
    
    public AsesorPorCiudadVo(Integer idLider,String nombre,String primerApellido,String ciudadResidencia){
        this.idLider = idLider;
        this.ciudadResidencia = ciudadResidencia;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
    }
    
    public Integer getIdLider(){
        return idLider;
    }
    
    public void setIdLider(Integer idLider){
        this.idLider = idLider;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getPrimerApellido(){
        return primerApellido;
    }
    
    public void setPrimerApellido(String primerApellido){
        this.primerApellido = primerApellido;
    }
    
    public String getCiudadResidencia(){
        return ciudadResidencia;
    }
    
    public void setCiudadResidencia(String ciudadResidencia){
        this.ciudadResidencia= ciudadResidencia;
    }
    
    
}
