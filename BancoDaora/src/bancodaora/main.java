package BancoDaora;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) throws Exception {
            int cod = 1;
            Banco b1 = new Banco();
//	Conta cc = new ContaCorrente(1000);
//        Conta ci = new ContaInvestimento(1000);
//        Conta cp = new ContaPoupanca(1000);
//        
//        cc.depositar(100);
//        ci.depositar(100);
//        cp.depositar(100);
//        cc.retirar(50);
//        ci.retirar(50);
//        cp.retirar(50);
//        cc.transferirPara(cp,100);
//        cp.transferirPara(ci,100);
//        System.out.println("Saldo conta corrente:" + cc.getSaldo());
//        System.out.println("Saldo conta poupança:" + cp.getSaldo());
//        System.out.println("Saldo conta investimento:" + ci.getSaldo());
            Scanner salve = new Scanner(System.in);
            for(;;){
            System.out.println("Escolha uma operação:");
            System.out.println("1-Fazer Conta");
            System.out.println("2-Localizar Conta Correntista");
            System.out.println("3-Excluir uma conta");
            int a = salve.nextInt();
            salve.nextLine();
            switch (a){
                case 1:
                    System.out.print("Digite o seu nome:");
                    String nome = salve.next();
                    salve.nextLine();
                    System.out.print("Digite o seu CPF:");
                    String cpf = salve.next();
                    salve.nextLine();
                    System.out.print("Escolha o tipo da conta:");
                    String isso = salve.next();
                    salve.nextLine();
                    if(isso == "Corrente"){
                        Conta cc = new ContaCorrente(nome,cpf,cod);
                        Correntista co = new Correntista(nome,cpf);
                        b1.adicionar(co);
                        b1.adicionar1(cc);
                }
                    if(isso == "Poupança"){
                        Correntista co = new Correntista(nome,cpf);
                        Conta cp = new ContaPoupanca(nome,cpf);
                        b1.adicionar(co);
                        b1.adicionar1(cp);
                }
                    if(isso == "Investimento"){
                        Correntista co = new Correntista(nome,cpf);
                        Conta ci = new ContaInvestimento(nome,cpf);
                        b1.adicionar(co);
                        b1.adicionar1(ci);
                }
                    cod ++;
                    break;
                case 2:
                    System.out.println("Digite o seu CPF");
                    
                    break;
                case 3:
                
                    break;
            }
            }
	}
	
}