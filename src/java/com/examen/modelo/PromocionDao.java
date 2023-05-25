/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.modelo;

import java.sql.*;

/**
 *
 * @author jose
 */
public class PromocionDao {
    public Boolean Insertar(int cod_promocion, String nombre,String descripcion,int provincia,String foto){
    try{
        Connection conexion=DBConexion.conectar();
        String sql="INSERT INTO promociones (cod_promocion, nombre, descripcion, cod_provincia, FotoPromocion) VALUES ("+cod_promocion+", '"+nombre+"', '"+descripcion+"', "+provincia+", '"+foto+"');";
        ResultSet registro=DBConexion.ejecutarSQL2(sql, conexion);
        
       }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
       return true;
    }
}
