package BancoDaora;

public class ContaCorrente extends Conta{
	private float saldo;

    ContaCorrente(float valor) {
        this.saldo = valor;
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