
/**
 * Escreva a descrição da classe Contribuinte aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Iterator;

public class ContribuinteInd extends Contribuinte
{
    private int agregado;
    private List <String> nifAgreg; 
    private double coeficiente;
    private List <Atividades> atividades; //codigos das atividades economicas
    
    public ContribuinteInd() {
        this.agregado = 0;
        this.nifAgreg = new ArrayList<>();
        this.coeficiente = 0.0;
        this.atividades = new ArrayList<>();
    }
    
    public ContribuinteInd (String nif, String email, String nome, String morada,
                            String password, int agregado, List<String> nifAgreg,
                            double coeficiente, List<Atividades> atividades) {
        super(nif, email, nome, morada, password);
        this.agregado = agregado;
        this.setNifAgreg(nifAgreg);
        this.coeficiente = coeficiente;
        this.setAtividades(atividades);
    }
    
    public ContribuinteInd (ContribuinteInd c) {
        super(c);
        this.agregado = c.getAgregado();
        this.nifAgreg = c.getNifAgreg();
        this.coeficiente = c.getCoeficiente();
        this.atividades = c.getAtividades(); 
    }
    
    
    public int getAgregado(){
        return this.agregado;
    }
    
    public List<String> getNifAgreg(){
        return new ArrayList<String>(this.nifAgreg);
    }
    
    public double getCoeficiente(){
        return this.coeficiente;
    }
    
    public List <Atividades> getAtividades() {
        List<Atividades> res = new ArrayList<>();
        
        for(Atividades a : this.atividades) {
            res.add(a);
        }
        return res;
    }
    
    
    public void setAgregado (int agregado){
        this.agregado=agregado;
    }
    
    public void setNifAgreg (List<String> nifAgreg){
        this.nifAgreg = new ArrayList<>();
        nifAgreg.forEach (s -> this.nifAgreg.add(s));
        }
    
    
    public void setCoeficeinte (double coeficiente){
        this.coeficiente=coeficiente;
    }
    
    public void setAtividades (List <Atividades> atividades){
        this.atividades = new ArrayList<Atividades>();
        atividades.forEach (s -> this.atividades.add(s));
    }
    
    public ContribuinteInd clone() {
        return new ContribuinteInd(this);
    }
    
    
    public boolean equals (Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        ContribuinteInd c = (ContribuinteInd) o;
        return c.getNif().equals(this.nif) && c.getEmail().equals(this.getEmail()) &&
               c.getMorada().equals(this.morada) && c.getNome().equals(this.getNome()) &&
               c.getPassword().equals(this.getPassword()) && c.getAgregado() == this.agregado &&
               c.getNifAgreg().equals(this.nifAgreg) &&
               c.getCoeficiente() == this.coeficiente &&
               c.getAtividades().equals(this.getAtividades());
    }
    
    
    public String toString() {
       StringBuilder sb = new StringBuilder ();
       sb.append ("Contribuinte Individual: \n");
       sb.append ("NIF: ").append(this.getNif());
       sb.append ("\nEmail de Contacto: ").append(this.getEmail());
       sb.append ("\nNome: ").append(this.getNome());
       sb.append ("\nMorada: ").append(this.getMorada());
       sb.append ("\nPassword: ").append(this.getPassword());
       sb.append ("\nNumero de Dependentes do Agregado Familiar: ").append(this.getAgregado());
       sb.append ("\nNumeros fiscais do Agregado Familiar: ").append(this.getNifAgreg().toString());
       sb.append ("\nCoeficiente Fiscal para Efeitos de Deduçao: ").append(this.getCoeficiente());
       sb.append ("\nCodigos das Atividades Economicas: ").append(this.getAtividades().toString());
       return sb.toString();
    }
}
