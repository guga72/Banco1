package bancodaora;
public abstract class Conta {
	
	private float saldo;
        private String nome;
        private String cpf;
        private int cod;
        private String conta;
        
	protected void setSaldo(float valor) {
		this.saldo = valor;
	}
	
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public abstract void depositar(float valor);
	
	public abstract void retirar(float valor);

	public void transferirPara(Conta outraConta, float valor) throws Exception {
		this.retirar(valor);
		outraConta.depositar(valor);
	}

	public String getcpf(){return cpf;}
	public String getConta(){return conta;}
	public int getCod(){return cod;	}
}