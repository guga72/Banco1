package bancodaora;

import java.util.ArrayList;
import java.util.Collection;

public class BancoConta extends Banco {
    private static Collection<Conta> conta = new ArrayList<Conta>();
    public void adicionar(Conta conta){
        BancoConta.conta.add(conta);
    }

    public Conta buscarConta(int a){
        Conta isso = null;
        for(Conta conta : BancoConta.conta) {
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
            BancoConta.conta.remove(a);
        }
        else{
            System.out.println("------------------------------------------");
            System.out.println("Conta inexistente");
            System.out.println("------------------------------------------");
        }

    }
}
