
package minhasclasses;
/**
 *
 * @author vitor
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private int datanasc;
    private int idade;
    
public Pessoa(){   
    }
    public Pessoa(String nome, String cpf, String endereco, int datanasc, int 
    idade){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.datanasc = datanasc;
        this.idade = idade;  
    } 
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(int datanasc) {
        this.datanasc = datanasc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long setDatanasc() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  }