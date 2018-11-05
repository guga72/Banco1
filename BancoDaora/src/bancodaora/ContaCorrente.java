package bancodaora;

public class ContaCorrente extends Conta{
	private float saldo = 0;
        private String nome;
        private String cpf;
        private int cod;
        private String conta;

    ContaCorrente(String a, String b, int c){
		this.saldo = 0;
        this.nome = a;
        this.cpf = b;
        this.cod = c;
		this.conta = "Corrente";
    }

	protected void setSaldo(float valor) {
		this.saldo = valor;
	}
	
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	
	public void retirar(float valor) {
		this.saldo = this.saldo - valor;
	}

	public void transferirPara(Conta outraConta, float valor) throws Exception {
		this.retirar(valor);
		outraConta.depositar(valor);
	}
	public String getcpf(){return cpf;}
	public String getConta(){return conta;}
	public int getCod(){return cod;	}
        public String getNome(){return nome;}
}