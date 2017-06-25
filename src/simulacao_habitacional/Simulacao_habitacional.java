/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacao_habitacional;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Douglas
 */
public class Simulacao_habitacional {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        UI_principal principal = new UI_principal();
        principal.setVisible(true);
        principal.setResizable(false);
        //conectando com o BD

              
    }
    
}
