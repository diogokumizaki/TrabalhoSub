/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unipar.br.bosing.livrodereceitas;

/**
 *
 * @author diogo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static void main(String[] args) {
        
        Connection connection = null;
        try {
            String jdbcUrl = "jdbc:mysql://localhost:5432/LivroReceita";
            String username = "postgres";
            String password = "1945";
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Conexão com o banco de dados estabelecida!");

            
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
                }
            }
        }
    }
}

