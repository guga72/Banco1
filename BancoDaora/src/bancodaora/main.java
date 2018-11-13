package bancodaora;



import java.util.Scanner;

public class main {

    public static void main(String[] args) throws Exception {
        int cod = 1;
        CriadorConta cria = new CriadorConta();
        BancoInter b1 = cria.criadorBanco();
        Scanner salve = new Scanner(System.in);
        for (; ; ) {
            int cont1 = 0;
            System.out.println("Escolha uma operação:");
            System.out.println("1-Fazer Conta");
            System.out.println("2-Localizar Conta");
            System.out.println("3-Excluir uma conta");
            System.out.println("4-Ver Situação da conta");
            System.out.println("5- Sair");
            int a = salve.nextInt();
            Menu m1 = new menu1(cod);
            switch (a) {
                case 1:
                    cod = m1.pOpcao(cod, b1, salve, cria);
                    break;
                case 2:
                    m1.sOpcao(b1, salve, cont1);
                            break;
                            case 3:
                                m1.tOpcao(b1, salve);
                                break;
                            case 4:
                                m1.qOpcao(b1, salve);
                                break;
                            case 5:
                                System.exit(0);
                                break;
                        }
                    }
            }
        }