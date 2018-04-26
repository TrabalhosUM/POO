
/**
 * Escreva a descrição da classe ContribuinteEmp aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class ContribuinteEmp extends Contribuinte
{
    private List <Atividades> infatecn;
    private double infatorcalc;
    
    public ContribuinteEmp () {
        super();
        this.infatecn = new ArrayList<>();
        this.infatorcalc = 0.0;
    }
    
    public ContribuinteEmp (String nif, String email, String nome,
                            String morada, String password,
                            List <Atividades> infatecn, double inffatorcalc){
       super(nif, email, nome, morada, password); 
       setInfatecn(infatecn);
       this.infatorcalc = infatorcalc;
    }
    
    public ContribuinteEmp (ContribuinteEmp e) {
        super(e);
        this.infatecn = e.getInfatecn();
        this.infatorcalc = e.getInfatorcalc();
    }
    
    
    public List<Atividades> getInfatecn() {
        List<Atividades> res = new ArrayList<>();
        for (Atividades a : this.infatecn) {
            res.add(a);
        }
        return res;
    }
    
    public double getInfatorcalc() {
        return this.infatorcalc;
    }
    
    
    public void setInfatecn (List <Atividades> atividades) {
        this.infatecn = new ArrayList<>();
        atividades.forEach(s -> {this.infatecn.add(s);});
    }
    
    public void setInfatorcalc() {
        this.infatorcalc = infatorcalc;
    }
    
    
    public ContribuinteEmp clone() {
        return new ContribuinteEmp(this);
    }
    
    
    public boolean equals (Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        ContribuinteEmp c = (ContribuinteEmp) o;
        return nif.equals(c.getNif()) && email.equals(c.getEmail()) && nome.equals(c.getNome()) &&
               morada.equals(c.getMorada()) && password.equals(c.getPassword()) && 
               infatecn.equals(c.getInfatecn()) &&
               infatorcalc == c.getInfatorcalc();
    }
    
    
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append ("Contribuinte Empresarial: \n");
       sb.append ("NIF: ").append(this.getNif());
       sb.append ("\nEmail de Contacto: ").append(this.getEmail());
       sb.append ("\nNome: ").append(this.getNome());
       sb.append ("\nMorada: ").append(this.getMorada());
       sb.append ("\nPassword: ").append(this.getPassword());
       sb.append ("\nAtividades: ").append(this.getInfatecn().toString());
       sb.append ("\nFator de Deduçao: ").append(this.getInfatorcalc());
       
       return sb.toString();
    }
}