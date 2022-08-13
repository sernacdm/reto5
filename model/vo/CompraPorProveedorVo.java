/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casacampestre.model.vo;

/**
 *
 * @author pc
 */
public class CompraPorProveedorVo {
    private Integer idCompra;
    private String constructora;
    private String bancoVinculado;
    
    public CompraPorProveedorVo(){
        
    }
    public CompraPorProveedorVo(Integer idCompra, String constructora, String bancoVinculado){
        this.bancoVinculado = bancoVinculado;
        this.idCompra = idCompra;
        this.constructora = constructora;
    }
    
    public Integer getIdCompra(){
        return idCompra;
    }
    
    public void setIdLider(Integer idCompra){
        this.idCompra = idCompra;
    }
    
    
    public String getConstructora(){
        return constructora;
    }
    
    public void setConstructora(String constructora){
        this.constructora = constructora;
    }
    
    public String getBancoVinculado(){
        return bancoVinculado;
    }
    
    public void setBancoVinculado(String bancoVinculado){
        this.bancoVinculado = bancoVinculado;
    }
}
