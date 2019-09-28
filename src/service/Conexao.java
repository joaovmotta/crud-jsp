package service;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection getInstance(){
        String url = "jdbc:mysql://127.0.0.1:3306/pessoa_db";
        String user = "root";
        String password = "root";

        try{
            Connection con = null;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("CONECTADO");
            return con;
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
