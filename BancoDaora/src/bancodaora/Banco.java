
package bancodaora;

import java.util.ArrayList;
import java.util.Collection;


public class Banco implements BancoInter {
    public Banco(){}
    private static Collection<Correntista> correntista = new ArrayList<Correntista>();
    private static Collection<Conta> conta = new ArrayList<Conta>();
    

    public void adicionar(Correntista correntista) {
        Correntista resultado = null;
        buscarPorCpf(correntista.getCpf());
        if(resultado == null) {
            Banco.correntista.add(correntista);
        }
    }
    public void adicionar(Conta conta){
        Banco.conta.add(conta);
    }

    public Correntista buscarPorCpf(String cpf) {
        Correntista resultado = null;
        for (Correntista correntista : Banco.correntista) {
            if (cpf.equals(correntista.getCpf())) {
                resultado = correntista;
                break;
            }
        }
        return resultado;
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