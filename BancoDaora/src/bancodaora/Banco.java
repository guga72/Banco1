
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
    
    public Correntista buscarPorCpf(String cpf) {
		Correntista resultado = null;
		
		for(Correntista correntista : Banco.correntista) {
			if(correntista.getCpf().equals(cpf)) {
				resultado = correntista;
				break;
			}
		}
		
		return resultado;
	}

	public Conta buscarConta(String cpf, String conta1){
        Conta isso = null;
        for(Conta Conta : Banco.conta) {
            if(Conta.getcpf().equals(cpf) && Conta.getConta().toUpperCase().equals(conta1)) {
                isso = Conta;
            }
            break;
        }
        return isso;
    }

    public Conta buscarConta(int a){
        Conta isso = null;
        for(Conta Conta : Banco.conta) {
            if(Conta.getCod() == a) {
                isso = Conta;
            }
            break;
        }
        return isso;
    }
    public void excluirConta(String cpf, int cod){
        for(Conta Conta : Banco.conta) {
            if(Conta.getcpf().equals(cpf) && Conta.getCod() == cod){
                Banco.conta.remove(conta);
            }
        }
    }
}
