
package minhasclasses;
/**
 *
 * @author VitóriaRAC
 */
public class Cadastro {
    private String nometutor;
    private String cpf;
    private String endereco;
    private int datanasctutor;
    private int idadetutor;
    private String nomepet;
    private String raca;
    private String tamanho;
    private int datanascpet;
    private int idadepet;
    
    public Cadastro(){   
    }
    
    public Cadastro(String nometutor, String cpf, String endereco, int datanasctutor, int 
    idadetutor, String nomepet, String raca, String tamanho, int datanascpet, int idadepet){
        
        this.nometutor = nometutor;
        this.cpf = cpf;
        this.endereco = endereco;
        this.datanasctutor = datanasctutor;
        this.idadetutor = idadetutor;
        this.nomepet = nomepet;
        this.raca = raca;
        this.tamanho = tamanho;
        this.datanascpet = datanascpet;
        this.idadepet = idadepet;
        
    } 
    
    public String getNomeTutor(){
        return nometutor;
    }
}
