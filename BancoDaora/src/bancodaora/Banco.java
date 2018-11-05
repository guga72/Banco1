
package bancodaora;

import java.util.ArrayList;
import java.util.Collection;


public class Banco {
    public Banco(){}
    private static Collection<Correntista> correntista = new ArrayList<Correntista>();
    private static Collection<Conta> conta = new ArrayList<Conta>();
    
    
//public void pesquisaCorre(){
//    Correntista resultado = null;
//    
//}

//    public Banco(Collection<Correntista> correntista, Collection<Conta> conta){
//        this.correntista.addAll(correntista);
//        this.conta.addAll(conta);
//}

    public void adicionar(Correntista correntista) {
	Banco.correntista.add(correntista);
    }
    public void adicionar(Conta conta){
        Banco.conta.add(conta);
    }
    
    public Conta buscarPorCpf(String cpf) {
		Conta resultado = null;
		
		for(Conta conta : Banco.conta) {
			if(conta.getcpf().equals(cpf)){
				resultado = conta;
				break;
			}
		}
		
		return resultado;
	}

	public Conta buscarConta(String cpf, String conta1){
        Conta isso = null;
        for(Conta conta : Banco.conta) {
            if(conta.getcpf().equals(cpf) && conta.getConta().toUpperCase().equals(conta1)) {
                isso = conta;
                break;
            }
            }
        return isso;
    }

    public Conta buscarConta(int a){
        Conta isso = null;
        for(Conta conta : Banco.conta) {
            if(a == conta.getCod()) {
                isso = conta;
                break;
            }
        }
        return isso;
    }
    public void excluirConta(String cpf, int cod){
       Conta a = this.buscarConta(cod);
           if(a != null){
            Banco.conta.remove(a);   
           }
        else{
            System.out.println("------------------------------------------");
            System.out.println("Conta inexistente");
            System.out.println("------------------------------------------");
        }
            
    }
}
