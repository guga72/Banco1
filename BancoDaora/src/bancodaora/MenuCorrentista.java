package bancodaora;

import java.util.Scanner;

public interface MenuCorrentista {
    void pOpcao(Conta no, Scanner salve);
    void sOpcao(Conta no, Scanner salve);
    void tOpcao(Conta no, Scanner salve, Banco b1);
}
