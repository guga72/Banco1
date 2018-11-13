package bancodaora;

import java.util.Scanner;

public interface Menu {

    int pOpcao(int a, BancoInter b1, Scanner salve, CriadorConta cria);
    void sOpcao(BancoInter b1, Scanner salve, int cont1);
    void tOpcao(BancoInter b1, Scanner salve);
    void qOpcao(BancoInter b1, Scanner salve);
}
