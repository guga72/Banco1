package bancodaora;



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
        String nome = null;
        String cpf = null;
        String isso = null;
        for (; ; ) {
            int cont1 = 0;
            System.out.println("Escolha uma operação:");
            System.out.println("1-Fazer Conta");
            System.out.println("2-Localizar Conta Correntista");
            System.out.println("3-Excluir uma conta");
            int a = salve.nextInt();
            salve.nextLine();
            switch (a) {
                case 1:
                    System.out.print("Digite o seu nome:");
                    nome = salve.next();
                    salve.nextLine();
                    System.out.print("Digite o seu CPF:");
                    cpf = salve.next();
                    salve.nextLine();
                    System.out.print("Escolha o tipo da conta:");
                    isso = salve.next();
                    salve.nextLine();
                    if (isso.toUpperCase().equals("CORRENTE")) {
                        Conta cc = new ContaCorrente(nome, cpf, cod);
                        Correntista co = new Correntista(nome, cpf);
                        b1.adicionar(co);
                        b1.adicionar(cc);
                        System.out.println("Seu cadastro foi realizado com sucesso!!!");
                        System.out.println("Nome:" + co.getNome());
                        System.out.println("CPF:" + co.getCpf());
                        System.out.println("Numero:" + cc.getCod());
                    }
                    if (isso.toUpperCase().equals("POUPANÇA")) {
                        Correntista co = new Correntista(nome, cpf);
                        Conta cp = new ContaPoupanca(nome, cpf, cod);
                        b1.adicionar(co);
                        b1.adicionar(cp);
                        System.out.println("Nome:" + co.getNome());
                        System.out.println("CPF:" + co.getCpf());
                        System.out.println("Numero:" + cp.getCod());
                    }
                    if (isso.toUpperCase().equals("INVESTIMENTO")) {
                        Correntista co = new Correntista(nome, cpf);
                        Conta ci = new ContaInvestimento(nome, cpf, cod);
                        b1.adicionar(co);
                        b1.adicionar(ci);
                        System.out.println("Nome:" + co.getNome());
                        System.out.println("CPF:" + co.getCpf());
                        System.out.println("Numero:" + ci.getCod());
                    }
                    cod++;
                    break;
                case 2:
                    System.out.print("Digite o seu CPF:");
                    cpf = salve.next();
                    Correntista no = b1.buscarPorCpf(cpf);
                    if (no == null) {
                        System.out.println("Não tem nenhuma conta");
                    } else {
                        while (cont1 == 0){
                            //System.out.println("Existe esta conta");

                            System.out.println("Deseja fazer alguma das ações:");
                            System.out.println("1-Depositar");
                            System.out.println("2-Retirar");
                            System.out.println("3-Transferir");
                            System.out.println("4-Sair");
                            int cont = salve.nextInt();
                            switch (cont) {
                                case 1:
                                    System.out.println("Deseja depositar em qual conta:");
                                    System.out.println("1- Corrente");
                                    System.out.println("2- Poupança");
                                    System.out.println("3- Investimento");
                                    int b = salve.nextInt();
                                    switch (b) {
                                        case 1:
                                            String conta = "CORRENTE";
                                            Conta retorno = b1.buscarConta(cpf, conta);
                                            if (retorno.equals(null)) {
                                                System.out.println("Não tem nenhuma conta agregada a esse cpf");
                                            } else {
                                                System.out.print("Quanto será depositado:");
                                                float depo = salve.nextFloat();
                                                Conta cc = new ContaCorrente(nome, cpf, cod);
                                                cc.depositar(depo);
                                            }
                                            break;
                                        case 2:
                                            String conta1 = "Poupança";
                                            Conta retorno1 = b1.buscarConta(cpf, conta1);
                                            if (retorno1.equals(null)) {
                                                System.out.println("Não tem nenhuma conta agregada a esse cpf");
                                            } else {
                                                System.out.print("Quanto será depositado:");
                                                float depo = salve.nextFloat();
                                                Conta cp = new ContaCorrente(nome, cpf, cod);
                                                cp.depositar(depo);
                                            }
                                            break;
                                        case 3:
                                            String conta2 = "Investimento";
                                            Conta retorno2 = b1.buscarConta(cpf, conta2);
                                            if (retorno2.equals(null)) {
                                                System.out.println("Não tem nenhuma conta agregada a esse cpf");
                                            } else {
                                                System.out.print("Quanto será depositado:");
                                                float depo = salve.nextFloat();
                                                Conta ci = new ContaCorrente(nome, cpf, cod);
                                                ci.depositar(depo);
                                            }
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("Deseja retirar em qual conta:");
                                    System.out.println("1- Corrente");
                                    System.out.println("2- Poupança");
                                    System.out.println("3- Investimento");
                                    int c = salve.nextInt();
                                    switch (c) {
                                        case 1:
                                            String conta = "CORRENTE";
                                            Conta retorno = b1.buscarConta(cpf, conta);
                                            if (retorno.equals(null)) {
                                                System.out.println("Não tem nenhuma conta agregada a esse cpf");
                                            } else {
                                                System.out.print("Quanto será retirado:");
                                                float depo = salve.nextFloat();
                                                Conta cc = new ContaCorrente(nome, cpf, cod);
                                                cc.retirar(depo);
                                            }
                                            break;
                                        case 2:
                                            String conta1 = "Poupança";
                                            Conta retorno1 = b1.buscarConta(cpf, conta1);
                                            if (retorno1.equals(null)) {
                                                System.out.println("Não tem nenhuma conta agregada a esse cpf");
                                            } else {
                                                System.out.print("Quanto será retirado:");
                                                float depo = salve.nextFloat();
                                                Conta cp = new ContaCorrente(nome, cpf, cod);
                                                cp.retirar(depo);
                                            }
                                            break;
                                        case 3:
                                            String conta2 = "Investimento";
                                            Conta retorno2 = b1.buscarConta(cpf, conta2);
                                            if (retorno2.equals(null)) {
                                                System.out.println("Não tem nenhuma conta agregada a esse cpf");
                                            } else {
                                                System.out.print("Quanto será retirado:");
                                                float depo = salve.nextFloat();
                                                Conta ci = new ContaCorrente(nome, cpf, cod);
                                                ci.retirar(depo);
                                            }
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.println("Qual o seu cpf:");
                                    cpf = salve.next();
                                    System.out.println("Qual a sua conta que deseja tranferir:");
                                    String tipo = salve.next();
                                    Conta retorno1 = b1.buscarConta(cpf, tipo);
                                    System.out.println("Qual o numero da conta que deseja tranferir:");
                                    int i = salve.nextInt();
                                    System.out.println("Quanto vai ser retirado:");
                                    float depo = salve.nextFloat();
                                    Conta a1 = b1.buscarConta(i);
                                    if (tipo.toUpperCase().equals("INVESTIMENTO")) {
                                        Conta cc = new ContaCorrente(nome, cpf, cod);
                                        cc.transferirPara(a1,depo);
                                    }
                                    if (tipo.toUpperCase().equals("POUPANÇA")) {
                                        Conta cc = new ContaPoupanca(nome, cpf, cod);
                                        cc.transferirPara(a1,depo);
                                    }
                                    if (tipo.toUpperCase().equals("INVESTIMENTO")) {
                                        Conta cc = new ContaInvestimento(nome, cpf, cod);
                                        cc.transferirPara(a1,depo);
                                    }
                                    break;
                                case 4:
                                    cont1 = 1;
                                    break;

                            }
                        }


                    }
                case 3:
                    System.out.print("Digite o numero da conta:");
                    int c1 = salve.nextInt();
                    System.out.println("Digite o seu cpf:");
                    String cpf1 = salve.next();
                    b1.excluirConta(cpf1, c1);
                    break;
            }
        }

    }
}