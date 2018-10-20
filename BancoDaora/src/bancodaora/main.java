package BancoDaora;

public class main {
	
	public static void main(String[] args) throws Exception {
	Conta cc = new ContaCorrente(1000);
        Conta ci = new ContaInvestimento(1000);
        Conta cp = new ContaPoupanca(1000);
        
        cc.depositar(100);
        ci.depositar(100);
        cp.depositar(100);
        cc.retirar(50);
        ci.retirar(50);
        cp.retirar(50);
        cc.transferirPara(cp,100);
        cp.transferirPara(ci,100);
        System.out.println("Saldo conta corrente:" + cc.getSaldo());
        System.out.println("Saldo conta poupança:" + cp.getSaldo());
        System.out.println("Saldo conta investimento:" + ci.getSaldo());
	}
	
}