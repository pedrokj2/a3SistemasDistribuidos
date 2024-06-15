package br.pet.db;

import java.sql.Date;
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

    public void salvar(Pessoa pessoa) throws ClassNotFoundException {
        try {
            ConnectorDB  connector = new ConnectorDB();
            String sql = "INSERT INTO bd_petcare.tbl_tutor (nome, cpf, endereco, data_nascimento, telefone) " +
                    "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = connector.getConnection().prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getCpf());
            stmt.setString(3, pessoa.getEndereco());
            stmt.setDate(4, Date.valueOf(pessoa.getNascimento()));
            stmt.setString(5, pessoa.getTelefone());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

}
