
/**
 * Classe abstrata Contribuinte - escreva a descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (versão ou data)
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class Contribuinte
{
    protected String nif;
    protected String email; 
    protected String nome;
    protected String morada;
    protected String password;
    
    public Contribuinte() {
        this.nif = "n/d";
        this.email = "n/d";
        this.nome = "n/d";
        this.morada = "n/d";
        this.password = "n/d";
    }
    
    public Contribuinte (String nif, String email, String nome,
                                   String morada, String password) {
        this.nif = nif;
        this.email = email;
        this.nome = nome;
        this.morada = morada;
        this.password = password;
    }
    
    public Contribuinte (Contribuinte e) {
        this.nif = e.getNif();
        this.email = e.getEmail();
        this.nome = e.getNome();
        this.morada = e.getMorada();
        this.password = e.getPassword();
    }
    
    
    public String getNif() { 
        return this.nif; 
    }
    
    public String getEmail() { 
        return this.email; 
    }
    
    public String getNome() { 
        return this.nome; 
    }
    
    public String getMorada() { 
        return this.morada; 
    }
    
    public String getPassword() {
        return this.password; 
    }
    
    
    public void setNif(String nif) {
        this.nif = nif;
    }
    
    public void setEmail (String email) {
        this.email = email;
    }
    
    public void setNome(String nome) { 
        this.nome = nome;
    }
    
    public void setMorada(String morada) { 
        this.morada = morada; 
    }
    
    public void setPassword(String password) { 
        this.password = password; 
    }
    
    
    public abstract Contribuinte clone();
    
    
    public boolean equals (Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Contribuinte e = (Contribuinte) o;
        return e.getNif().equals(this.nif) &&
               e.getEmail().equals(this.email) &&
               e.getNome().equals(this.nome) &&
               e.getMorada().equals(this.morada) &&
               e.getPassword().equals(this.password);
    }
    
    
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append ("Contribuinte: ");
        sb.append ("\nNumero Fiscal: ").append (this.nif);
        sb.append ("\nEmail de Contacto: ").append (this.email);
        sb.append ("\nNome: ").append (this.nome);
        sb.append ("\nMorada: ").append (this.morada);
        sb.append ("\nPassword de Acesso: ").append (this.password);
        return sb.toString();
    }
}
