package bancodaora;

import java.util.Scanner;

public class menu1 implements Menu {
    private String nome;
    private String cpf;
    private int cod;

    menu1(int a){
        this.cod = a;
    }

    @Override
    public int pOpcao(int a, Banco b1, Scanner salve, Banco b2) {
        System.out.print("Digite o seu nome:");
        salve.nextLine();
        this.nome = salve.next();
        System.out.print("Digite o seu CPF:");
        salve.nextLine();
        this.cpf = salve.next();
        System.out.print("Escolha o tipo da conta:");
        salve.nextLine();
        String isso = salve.next();
        if (isso.toUpperCase().equals("CORRENTE")) {
            Conta cc = new ContaCorrente(nome, cpf, a);
            b1.adicionar(cc);
            System.out.println("------------------------------------------");
            System.out.println("Seu cadastro foi realizado com sucesso!!!");
            System.out.println("Numero:" + cc.getCod());
            System.out.println("------------------------------------------");
        }
        if (isso.toUpperCase().equals("POUPANÇA")) {
            Conta cp = new ContaPoupanca(nome, cpf, a);
            b1.adicionar(cp);
            System.out.println("------------------------------------------");
            System.out.println("Seu cadastro foi realizado com sucesso!!!");
            System.out.println("Numero:" + cp.getCod());
            System.out.println("------------------------------------------");
        }
        if (isso.toUpperCase().equals("INVESTIMENTO")) {
            Conta ci = new ContaInvestimento(nome, cpf, a);
            b1.adicionar(ci);
            System.out.println("------------------------------------------");
            System.out.println("Seu cadastro foi realizado com sucesso!!!");
            System.out.println("Numero:" + ci.getCod());
            System.out.println("------------------------------------------");
        }
        if(b2.buscarPorCpf(cpf) == null) {
            Correntista co = new Correntista(nome, cpf);
            b2.adicionar(co);
        }
        cod++;
        return cod;
    }

    @Override
    public void sOpcao(Banco b1, Scanner salve, int cont1) {
        System.out.print("Digite o codigo da sua conta:");
        int cont2 = salve.nextInt();
        Conta no = b1.buscarConta(cont2);
        if (no == null) {
            System.out.println("Não tem nenhuma conta");
        } else {
            while (cont1 == 0) {

                System.out.println("Deseja fazer alguma das ações:");
                System.out.println("1-Depositar");
                System.out.println("2-Retirar");
                System.out.println("3-Transferir");
                System.out.println("4-Sair");
                int cont = salve.nextInt();
                MenuCorrentista m1 = new Menu2();
                switch (cont) {
                    case 1:
                        m1.pOpcao(no, salve);
                        break;
                    case 2:
                        m1.sOpcao(no, salve);
                        break;
                    case 3:
                         m1.tOpcao(no, salve, b1);
                        break;
                    case 4:
                        cont1 = 1;
                        break;
                }
            }
        }
    }

    @Override
    public void tOpcao(Banco b1, Scanner salve) {
        System.out.println("------------------------------------------");
        System.out.print("Digite o número da conta:");
        int c1 = salve.nextInt();
        System.out.print("Digite o seu cpf:");
        String cpf1 = salve.next();
        b1.excluirConta(cpf1, c1);
    }

    @Override
    public void qOpcao(Banco b1, Scanner salve) {
        System.out.print("Escreva o número da sua conta:");
        int num = salve.nextInt();
        Conta c = b1.buscarConta(num);
        System.out.println("------------------------------------------");
        System.out.println("Saldo:" + c.getSaldo());
        System.out.println("CPF:" + c.getcpf());
        System.out.println("Tipo da conta:" + c.getConta());
        System.out.println("Nome:" + c.getNome());
        System.out.println("------------------------------------------");
    }
}
