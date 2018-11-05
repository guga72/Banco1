package bancodaora;



import java.util.Scanner;

public class main {

    public static void main(String[] args) throws Exception {
        int cod = 1;
        Banco b1 = new Banco();
        Scanner salve = new Scanner(System.in);
        String nome;
        String cpf;
        String isso;
        for (; ; ) {
            int cont1 = 0;
            System.out.println("Escolha uma operação:");
            System.out.println("1-Fazer Conta");
            System.out.println("2-Localizar Conta Correntista");
            System.out.println("3-Excluir uma conta");
            System.out.println("4-Ver Situação da conta");
            System.out.println("5- Sair");
            int a = salve.nextInt();
            switch (a) {
                case 1:
                    System.out.print("Digite o seu nome:");
                    salve.nextLine();
                    nome = salve.next();
                    System.out.print("Digite o seu CPF:");
                    salve.nextLine();
                    cpf = salve.next();
                    System.out.print("Escolha o tipo da conta:");
                    salve.nextLine();
                    isso = salve.next();
                    if (isso.toUpperCase().equals("CORRENTE")) {
                        Conta cc = new ContaCorrente(nome, cpf, cod);
                        b1.adicionar(cc);
                        System.out.println("------------------------------------------");
                        System.out.println("Seu cadastro foi realizado com sucesso!!!");
                        System.out.println("Numero:" + cc.getCod());
                        System.out.println("------------------------------------------");
                    }
                    if (isso.toUpperCase().equals("POUPANÇA")) {
                        Conta cp = new ContaPoupanca(nome, cpf, cod);
                        b1.adicionar(cp);
                        System.out.println("------------------------------------------");
                        System.out.println("Seu cadastro foi realizado com sucesso!!!");
                        System.out.println("Numero:" + cp.getCod());
                        System.out.println("------------------------------------------");
                    }
                    if (isso.toUpperCase().equals("INVESTIMENTO")) {
                        Conta ci = new ContaInvestimento(nome, cpf, cod);
                        b1.adicionar(ci);
                        System.out.println("------------------------------------------");
                        System.out.println("Seu cadastro foi realizado com sucesso!!!");
                        System.out.println("Numero:" + ci.getCod());
                        System.out.println("------------------------------------------");
                    }
                    if(b1.buscarPorCpf(cpf) == null) {
                        Correntista co = new Correntista(nome, cpf);
                        b1.adicionar(co);
                    }
                    cod++;
                    break;
                case 2:
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
                            switch (cont) {
                                case 1:
                                    System.out.print("Quanto será depositado:");
                                    float depo1 = salve.nextFloat();
                                    no.depositar(depo1);
                                    break;
                                case 2:
                                    System.out.print("Quanto será retirado:");
                                    float depo2 = salve.nextFloat();
                                    no.retirar(depo2);
                                    break;
                                case 3:
                                    System.out.print("Qual o número da conta que deseja transferir:");
                                    int num3 = salve.nextInt();
                                    Conta c2 = b1.buscarConta(num3);
                                    System.out.print("Quanto será depositado:");
                                    float depo3 = salve.nextFloat();
                                    no.transferirPara(c2,depo3);
                                    break;
                                case 4:
                                    cont1 = 1;
                                    break;
                            }
                        }
                            }
                            break;
                            case 3:
                                System.out.println("------------------------------------------");
                                System.out.print("Digite o número da conta:");
                                int c1 = salve.nextInt();
                                System.out.print("Digite o seu cpf:");
                                String cpf1 = salve.next();
                                b1.excluirConta(cpf1, c1);
                                break;
                            case 4:
                                System.out.print("Escreva o número da sua conta:");
                                int num = salve.nextInt();
                                Conta c = b1.buscarConta(num);
                                    System.out.println("------------------------------------------");
                                    System.out.println("Saldo:" + c.getSaldo());
                                    System.out.println("CPF:" + c.getcpf());
                                    System.out.println("Tipo da conta:" + c.getConta());
                                    System.out.println("Nome:" + c.getNome());
                                    System.out.println("------------------------------------------");
                                break;

                            case 5:
                                System.exit(0);
                                break;
                        }
                    }

            }
        }
