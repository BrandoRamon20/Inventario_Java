/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import java.sql.*;
import Utils.Conexion;
import java.awt.List;
import java.util.ArrayList;
/**
 *
 * @author Brando
 */
public class Privileges {
        Conexion con = new Conexion();
        
        public ArrayList ListarPrivilegios(){
            ArrayList<String> lista = new ArrayList();
            try{
                ResultSet res = con.SQL("SELECT * FROM privileges");
                while(res.next()){
                       String nombre = res.getString("name");
                       lista.add(nombre);
                }
            }catch(SQLException e) {
     
            }
            return lista;
    }
}
