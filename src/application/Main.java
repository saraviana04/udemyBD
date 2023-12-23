package application;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {


    public static void main(String[] args) {

        Connection conn  = DB.getConnection();

       /* try (Statement statement = conn.createStatement()){
            String sql = " insert usuario (id_usario, nome_usario, senha_usario) values (2, 'sara', 'hjkll') ";
          int linhasAfetadas = statement.executeUpdate(sql);
            System.out.println(linhasAfetadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        */
        /*String sql = " insert usuario (id_usario, nome_usario, senha_usario) values (?, ?, ?) ";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1,3);
            pstmt.setString(2, "Elson");
            pstmt.setString(3,"rrrrr");
            int linhasAfetadas = pstmt.executeUpdate();
            System.out.println(linhasAfetadas);*/


/*
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        DB.closeConnection();



    }
}
