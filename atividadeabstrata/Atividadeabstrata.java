
package atividadeabstrata;


public class Atividadeabstrata {

  
    public static void main(String[] args) {
       Gerente G = new Gerente();
       Programador P = new Programador();
       
       G.setNome("janaina");
       G.setSalario(10000);
       G.aumentaSalario();
       
       P.setNome("Anna");
       P.setSalario(3000);
       P.aumentaSalario();
       
    }
    
}
