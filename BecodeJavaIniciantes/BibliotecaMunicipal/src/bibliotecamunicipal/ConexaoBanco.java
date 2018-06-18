/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecamunicipal;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luciano.t.da.silva
 */
public class ConexaoBanco {

    public Statement Stm;
    public ResultSet Rs;

    private String Driver = "oracle.jdbc.driver.OracleDriver";
    private String Caminho = "jdbc:oracle:thin:@localhost:1521:biblioteca";
    private String Usuario = "biblioteca";
    private String Senha = "biblioteca";

    public Connection Conn;

    public void conexao() {

        try {

            System.setProperty("jdbc.Drivers", Driver);
            Conn = DriverManager.getConnection(Caminho, Usuario, Senha);
            JOptionPane.showMessageDialog(null, "Conectado!!!");
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void desconexao() {
        try {
            Conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
