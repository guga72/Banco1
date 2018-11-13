package bancodaora;

public class CriadorConta {

    public Banco criadorBanco() {
        Banco banco = new Banco();
        return banco;
    }

    public Conta criadorcc(String nome, String cpf, int a, BancoInter banco){
        Conta cc = new ContaCorrente(nome, cpf, a);
        banco.adicionar(cc);
        return cc;
    }

    public Conta criadorci(String nome, String cpf, int a, BancoInter banco){
        Conta ci = new ContaInvestimento(nome, cpf, a);
        banco.adicionar(ci);
        return ci;
    }

    public Conta criadorcp(String nome, String cpf, int a, BancoInter banco){
        Conta cp = new ContaPoupanca(nome, cpf, a);
        banco.adicionar(cp);
        return cp;
    }
}
