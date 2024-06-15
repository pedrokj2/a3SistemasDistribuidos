
package br.pet.db;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import minhasclasses.Pessoa;

/**
 *
 * @author vitor
 */
public class PessoaDB {
    public void salvar(Pessoa pessoa) throws SQLException{
        
        String query = "INSERT INTO pessoas (nome, cpf, data_nascimento) VALUES(?, ?, ?);";
        statement.setString(1, pessoa.getNome());
        statement.setString(2, pessoa.getCpf());
        statement.setDate(3, new java.sql.Date(pessoa.setDatanasc()));    
    }

    private String pessoagetNome() {
        throw new UnsupportedOperationException("Not supported yet.");
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
            
    
}
