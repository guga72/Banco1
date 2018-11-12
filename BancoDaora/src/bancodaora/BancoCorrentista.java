package bancodaora;

import java.util.ArrayList;
import java.util.Collection;

public class BancoCorrentista extends Banco {
    public BancoCorrentista(){}

    private static Collection<Correntista> correntista = new ArrayList<Correntista>();

    public void adicionar(Correntista a) {
        Correntista resultado = null;
        buscarPorCpf(a.getCpf());
        if(resultado == null) {
            BancoCorrentista.correntista.add(a);
        }
    }
    public Correntista buscarPorCpf(String cpf) {
        Correntista resultado = null;
        for (Correntista correntista : BancoCorrentista.correntista) {
            if (cpf.equals(correntista.getCpf())) {
                resultado = correntista;
                break;
            }
        }
        return resultado;
    }




}
