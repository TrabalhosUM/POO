
/**
 * Escreva a descrição da classe Fatura aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class Despesas
{
    private String nifEmitente; 
    private String emitente; 
    private LocalDate data;
    private String nifCliente;
    private String tipoDespesa;
    private Atividades atividadeconomica;
    private double valorDespesa;
    private double iva;

    
    public Despesas() {
        this.nifEmitente= "n/d";
        this.emitente = "n/d";
        this.data = LocalDate.now();
        this.nifCliente = "n/d";
        this.tipoDespesa = "n/d";
        //this.atividadeconomica= Atividades;
        this.valorDespesa = 0.0;
        this.iva= 0.0;

    }
    
    public Despesas (String nifEmitente, String emitente, LocalDate data, String nifCliente,
                   String tipoDespesa, Atividades atividadeconomica, double valorDespesa, double iva) {
        this.nifEmitente= nifEmitente;
        this.emitente = emitente;
        this.data = data;
        this.nifCliente = nifCliente;
        this.tipoDespesa = tipoDespesa;
        this.atividadeconomica = atividadeconomica;
        this.valorDespesa = valorDespesa;
        this.iva=iva;
    }
    
    public Despesas (Despesas f) {
        this.nifEmitente= f.getNifEmitente();
        this.emitente = f.getEmitente();
        this.data = f.getData();
        this.nifCliente = f.getNifCliente();
        this.tipoDespesa = f.getTipoDespesa();
        this.atividadeconomica = f.getAtividadeconomica();
        this.valorDespesa = f.getValorDespesa();
        this.iva = f.getIva();
    }
    
    
     public String getNifEmitente() {
        return this.nifEmitente;
    }
    
    public String getEmitente() {
        return this.emitente;
    }
    
    public LocalDate getData() {
        return this.data;
    }
    
    public String getNifCliente() {
        return this.nifCliente;
    }
    
    public String getTipoDespesa() {
        return this.tipoDespesa;
    }
    
    public Atividades getAtividadeconomica() {
        return this.atividadeconomica;
    }
    
    public double getValorDespesa(){
        return this.valorDespesa;
    }
    
    public double getIva(){
        return this.iva;
    }
    
    public void setNifEmitente (String nifEmitente) {
        this.nifEmitente = nifEmitente;
    }
    
    public void setEmitente (String emitente){
        this.emitente = emitente;
    }
    
    public void setData (LocalDate data){
        this.data = data;
    }
    
    public void setNifCliente (String nifCliente) {
        this.nifCliente = nifCliente;
    }
    
    public void setTipoDespesa(String tipoDespesa){
        this.tipoDespesa = tipoDespesa;
    }
    
    public void setAtividadeconomica(Atividades atividadeconomica){
        this.atividadeconomica = atividadeconomica;
    }
    
    public void setValorDespesa(double valorDespesa){
        this.valorDespesa = valorDespesa;
    }
    
    public void setIva(double iva){
        this.iva=iva;
    }
    
    
    
    public boolean equals (Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Despesas f = (Despesas) o;
        return f.getNifEmitente().equals(this.nifEmitente) &&
               f.getEmitente().equals(this.emitente) &&
               data.equals(f.getData()) &&
               f.getNifCliente().equals(this.nifCliente) &&
               f.getTipoDespesa().equals(this.tipoDespesa) &&
               f.getAtividadeconomica().equals(this.atividadeconomica) &&
               f.getValorDespesa() == this.valorDespesa &&
               f.getIva() == this.iva;
    }
    
    
     public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append ("Despesas: ");
        sb.append ("\nNumero Fiscal do Emitente: ").append (this.nifEmitente);
        sb.append ("\nDesignaçao do Emitente: ").append (this.emitente);
        sb.append ("\nData da Despesa: ").append (this.data);
        sb.append ("\nNumero Fiscal do Cliente: ").append (this.nifCliente);
        sb.append ("\nTipo de Despesa").append (this.tipoDespesa);
        sb.append ("\nNatureza da Despesa: ").append (this.atividadeconomica);
        sb.append ("\nValor de Despesa: ").append (this.valorDespesa);
        sb.append ("\nIva: ").append(this.iva);
        return sb.toString();
    }
    
    public double calculaIvaEmp (double i){ //calcula iva empresarial
            return i = valorDespesa * 0.06;
    }
    
    public double calculaIvaInd (double i){
            return i = valorDespesa * 0.23;
    }
}
