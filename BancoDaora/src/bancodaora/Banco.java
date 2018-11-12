
package bancodaora;

import java.util.ArrayList;
import java.util.Collection;


public abstract class Banco {
    public Banco(){}
    private static Collection<Correntista> correntista = new ArrayList<Correntista>();
    private static Collection<Conta> conta = new ArrayList<Conta>();
    

    public void adicionar(Correntista correntista) {
	Banco.correntista.add(correntista);
    }
    public void adicionar(Conta conta){
        Banco.conta.add(conta);
    }

    public Correntista buscarPorCpf(String cpf) {
		Correntista resultado = null;
		return resultado;
	}


    public Conta buscarConta(int a){
        Conta isso = null;
        return isso;
    }
    public void excluirConta(String cpf, int cod){

        }
            
    }

