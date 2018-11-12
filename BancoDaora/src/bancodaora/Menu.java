package bancodaora;

import java.util.Scanner;

public interface Menu {

    int pOpcao(int a, Banco b1, Scanner salve, Banco b2);
    void sOpcao(Banco b1, Scanner salve, int cont1);
    void tOpcao(Banco b1, Scanner salve);
    void qOpcao(Banco b1, Scanner salve);
}
