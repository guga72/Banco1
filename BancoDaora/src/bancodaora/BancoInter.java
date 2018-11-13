package bancodaora;

public interface BancoInter {
    public void adicionar(Correntista correntista);
    public void adicionar(Conta conta);
    public Correntista buscarPorCpf(String cpf);
    public Conta buscarConta(int a);
    public void excluirConta(String cpf, int cod);
}
