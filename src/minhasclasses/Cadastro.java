
package minhasclasses;
/**
 *
 * @author VitóriaRAC
 */
public class Cadastro {
    private String nometutor;
    private String cpf;
    private String endereco;
    private int nasctutor;
    private int idadetutor;
    private String nomepet;
    private String raca;
    private String tamanho;
    private int nascpet;
    private int idadepet;
    
    public Cadastro(){   
    }
    
    public Cadastro(String nometutor, String cpf, String endereco, int nasctutor, int 
    idadetutor, String nomepet, String raca, String tamanho, int nascpet, int idadepet){
        
        this.nometutor = nometutor;
        this.cpf = cpf;
        this.endereco = endereco;
        this.nasctutor = nasctutor;
        this.idadetutor = idadetutor;
        this.nomepet = nomepet;
        this.raca = raca;
        this.tamanho = tamanho;
        this.nascpet = nascpet;
        this.idadepet = idadepet;
        
    } 
    
    public String getNomeTutor(){
        return nometutor;
    }
}
