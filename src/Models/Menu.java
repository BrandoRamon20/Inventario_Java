/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Utils.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import Models.Privileges;
import java.util.ArrayList;
/**
 *
 * @author Brando
 */
public class Menu {
    public ArrayList show(){
        Boolean response = false;
        Privileges priv = new Privileges();
        ArrayList privilegios = priv.ListarPrivilegios();
        System.out.print(privilegios);
        return privilegios;
    }
}
