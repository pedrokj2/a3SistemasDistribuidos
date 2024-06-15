/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pet.db;

import java.sql.Date;
import java.sql.SQLException;
import minhasclasses.Pessoa;
import java.sql.PreparedStatement;




/**
 *
 * @author vitor
 */
public class Tutor {
    
   
    
   public void salvar(Tutor tutor) throws SQLException, ClassNotFoundException {
        ConnectorDB  connector = new ConnectorDB();
        String sql = "INSERT INTO tbl_tutor (nome, cpf, endereco, nascimento,telefone) " +
                    "VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = connector.getConnection().prepareStatement(sql);
            stmt.setString(1, tutor.getNome());
            stmt.setString(2, tutor.getCpf());
            stmt.setString(3, tutor.getEndereco());
            stmt.setDate(4, Date.valueOf(tutor.getNascimento()));
            stmt.setString(5, tutor.getTelefone());
            stmt.executeUpdate();
    }

    private String tutorgetNome() {
        throw new UnsupportedOperationException("Not supported yet.");
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getCpf() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getEndereco() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getNascimento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getTelefone() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    

} 

