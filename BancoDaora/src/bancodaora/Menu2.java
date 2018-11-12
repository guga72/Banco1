package bancodaora;

import java.util.Scanner;

public class Menu2 implements MenuCorrentista {

    @Override
    public void pOpcao(Conta no, Scanner salve) {
        System.out.print("Quanto será depositado:");
        float depo1 = salve.nextFloat();
        no.depositar(depo1);
    }

    @Override
    public void sOpcao(Conta no, Scanner salve) {
        System.out.print("Quanto será retirado:");
        float depo2 = salve.nextFloat();
        no.retirar(depo2);
    }

    @Override
    public void tOpcao(Conta no, Scanner salve, Banco b1) {
        System.out.print("Qual o número da conta que deseja transferir:");
        int num3 = salve.nextInt();
        Conta c2 = b1.buscarConta(num3);
        System.out.print("Quanto será depositado:");
        float depo3 = salve.nextFloat();
        try {
            no.transferirPara(c2, depo3);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
