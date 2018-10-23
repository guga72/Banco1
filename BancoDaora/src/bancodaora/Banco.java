
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
    
    public static Correntista buscarPorCpf(String cpf) {		
		Correntista resultado = null;
		
		for(Correntista correntista : Banco.correntista) {
			if(correntista.getCpf().equals(cpf)) {
				resultado = correntista;
				break;
			}
		}
		
		return resultado;
	}
    
}
