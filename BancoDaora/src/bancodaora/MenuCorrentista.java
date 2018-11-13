package bancodaora;

import java.util.Scanner;

public interface MenuCorrentista {
    void pOpcao(ContaInter no, Scanner salve);
    void sOpcao(ContaInter no, Scanner salve);
    void tOpcao(ContaInter no, Scanner salve, BancoInter b1);
}
