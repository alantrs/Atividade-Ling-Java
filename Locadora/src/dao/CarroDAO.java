/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Carro;
import view.Exposicao;
/**
 *
 * @author Igor
 */
public class CarroDAO {
    private final Connection connection;
    
    public CarroDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Carro usuario) throws SQLException {
        
        String sql = "insert into carro(marca, modelo , ano, cor, cambio, potencia, preco)"
                + "values ('"+usuario.getMarca()+"','"+usuario.getModelo()+"','"+usuario.getAno()+"','"+usuario.getCor()+"',"
                + "'"+usuario.getCambio()+"','"+usuario.getPotencia()+"','"+usuario.getPreco()+"')";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close();
    }
}
