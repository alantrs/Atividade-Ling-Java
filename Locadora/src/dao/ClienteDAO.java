/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Cliente;
/**
 *
 * @author Igor
 */
public class ClienteDAO {
    private final Connection connection;
    
    public ClienteDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Cliente usuario) throws SQLException {
        
        String sql = "insert into cliente(nome, telefone, email, cpf, endereco) values ('"+usuario.getNome()+"','"+usuario.getTelefone()+"','"+usuario.getEmail()+"','"+usuario.getCpf()+"','"+usuario.getEndereco()+"'); ";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close();
    }
}
