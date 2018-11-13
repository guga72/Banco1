package bancodaora;

public class CriadorCorrentista {

    public Correntista criadorco(String nome, String cpf){
        Correntista co = new Correntista(nome, cpf);
        return co;
    }
}
