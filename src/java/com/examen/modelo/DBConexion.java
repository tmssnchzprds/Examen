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
public class DBConexion {
    public static Connection conectar() {
    String src="jdbc:mysql://192.168.2.220";
    String user="root";
    String pass="sexpe2010";
    String db="inmobiliaria-profesor_dbo";
    Connection conexion=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection(src+"/"+db,user,pass);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return conexion;
    }
    public static ResultSet ejecutarSQL(String sql,Connection conexion){
    ResultSet filas=null;
        try {
            Statement sentencia=conexion.createStatement();
            filas=sentencia.executeQuery(sql);
            
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return filas;
    }
     public static ResultSet ejecutarSQL2(String sql,Connection conexion){
     ResultSet filas=null;
         try {
            Statement sentencia=conexion.createStatement();
            sentencia.executeUpdate(sql);
                        
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return filas;
    }
}
