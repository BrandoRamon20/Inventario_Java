/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import Utils.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Brando
 */
public class Login {
    
    public Boolean autenticar(String username,String password){
        Boolean response = false;
        
        try{
        Conexion cn = new Conexion();
        ResultSet resultado = cn.SQL("SELECT * FROM usuario WHERE username='"+username+"' AND password='"+password+"'");
        if(resultado.next()){
            response = true;
         }
        }catch(SQLException e){
            System.out.print(e.getMessage());
         }
        return response;
    }
}
