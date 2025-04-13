
package atividadeabstrata;


public abstract class Funcionario {
    protected String nome;
    protected double salario;
    
    public abstract void aumentaSalario();
    
    public void setNome(String nome){
        this.nome=nome;
        
    }
    public String getNome(){
        return nome; 
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
}
