
package minhasclasses;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 *
 * @author VitóriaRAC
 */
public class Pet {
    private String nome;
    private String raca;
    private String tamanho;
    private LocalDate nascimento;
    ArrayList<Cadastro> cadastro;
    
    
    public int getIdade() {
        return Period.between(nascimento, LocalDate.now()).getMonths();
    }
}
