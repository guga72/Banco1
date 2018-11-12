package bancodaora;

public interface ContaInter {
    void setSaldo(float valor);
    float getSaldo();
    void depositar(float valor);
    void retirar(float valor);
    void transferirPara(Conta outraConta, float valor)throws Exception;
    String getcpf();
    String getConta();
    int getCod();
    String getNome();
}
