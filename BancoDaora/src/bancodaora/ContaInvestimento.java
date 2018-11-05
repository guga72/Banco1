package bancodaora;

public class ContaInvestimento extends Conta{
	private float saldo = 0;
        private String cpf;
        private String nome;
        private int cod;
        private String conta;

    ContaInvestimento(String a, String b, int c){
		this.saldo = 0;
        this.nome = a;
        this.cpf = b;
		this.cod = c;
		this.conta = "Investimento";
    }
	protected void setSaldo(float valor) {
		this.saldo = valor;
	}
	
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
                render(this.saldo);
	}
	
	public void retirar(float valor) {
		this.saldo = this.saldo - valor;
	}

	public void transferirPara(Conta outraConta, float valor) throws Exception {
		this.retirar(valor);
		outraConta.depositar(valor);
	}
        public void render(float saldo){
            this.saldo = this.saldo * 1.05f;
        }
		public String getcpf(){return cpf;}
	public String getConta(){return conta;}
	public int getCod(){return cod;	}
        public String getNome(){return nome;}
}