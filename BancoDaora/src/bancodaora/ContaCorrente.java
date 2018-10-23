package BancoDaora;

public class ContaCorrente extends Conta{
	private float saldo;
        private String nome;
        private String cpf;
        private int cod;

    ContaCorrente(String a, String b, int c){
        this.nome = a;
        this.cpf = b;
        this.cod = c;
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
}