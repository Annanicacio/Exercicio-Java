
package atividadeabstrata;


public class Gerente extends Funcionario {
    private double aumento;
    private double novosalario; 
    
    public void setAumento(double aumento){
        this.aumento = aumento; 
    }
    public double getAumento(){
        return aumento;
    }
    
    public void setNovosalario(double novosalario){
        this.novosalario = novosalario; 
    }
    public double getNovosalario(){
        return novosalario;
    }
    
    @Override
    public void aumentaSalario(){
        aumento = salario * 0.10;
        novosalario = salario + aumento; 
        System.out.println("Gerente recebeu um aumento de: " + getAumento());
        System.out.println("Salario atual: " + getNovosalario());
    }
    
    
}
