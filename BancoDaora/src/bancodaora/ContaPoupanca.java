package BancoDaora;

public class ContaPoupanca extends Conta {
	private float saldo;
        private String cpf;
        private String nome;
        private int cod;

    ContaPoupanca(String a, String b){
        this.nome = a;
        this.cpf = b;
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
}