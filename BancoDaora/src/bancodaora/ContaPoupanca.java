package bancodaora;

public class ContaPoupanca extends Conta {
	private float saldo;
        private String cpf;
        private String nome;
        private int cod;
        private String conta;

    ContaPoupanca(String a, String b, int c){
        this.nome = a;
        this.cpf = b;
		this.cod = c;
        this.conta = "Poupanca";
    }
	
	protected void setSaldo(float valor) {
		this.saldo = valor;
	}
	
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void depositar(float valor) {
		this.saldo = this.saldo + (valor * 1.1f);
	}
	
	public void retirar(float valor) {
		this.saldo = this.saldo - valor;
	}

	public void transferirPara(Conta outraConta, float valor) throws Exception {
		this.retirar(valor);
		outraConta.depositar(valor);
	}
	public String getcpf(){return cpf;}
        public String getNome(){return nome;}
        public String getConta(){
            return conta;
        }
}