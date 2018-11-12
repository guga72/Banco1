package bancodaora;
public abstract class Conta implements ContaInter {
	
	private float saldo;
        private String nome;
        private String cpf;
        private int cod;
        private String conta;
	@Override
	public void setSaldo(float valor) {
		this.saldo = valor;
	}

	@Override
	public float getSaldo() {
		return this.saldo;
	}
	@Override
	public abstract void depositar(float valor);
	@Override
	public abstract void retirar(float valor);
	@Override
	public void transferirPara(Conta outraConta, float valor) throws Exception {
		this.retirar(valor);
		outraConta.depositar(valor);
	}
	@Override
	public String getcpf(){return cpf;}
	@Override
	public String getConta(){return conta;}
	@Override
	public int getCod(){return cod;	}
	@Override
	public String getNome(){return nome;}
        
}