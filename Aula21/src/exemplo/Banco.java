package exemplo;

import java.util.Scanner;

public class Banco {
    public static String leString(String mensagem){
        Scanner ler = new Scanner(System.in);
        System.out.print(mensagem+": ");
        return ler.nextLine();
    }

    public static float leFloat(String mensagem){
        Scanner ler = new Scanner(System.in);
        System.out.print(mensagem+": ");
        return ler.nextFloat();
    }

    public static ContaCorrente acessaCC(ContaCorrente c1){
        //
        return c1;
    }

    public static ContaPopanca acessaCP(ContaPopanca c1){
        //
        return c1;
    }

    public static void main(String[] args) {
        ContaCorrente[] listaCC = new ContaCorrente[20];
        ContaPopanca[] listaCp = new ContaPopanca[20];
        int contCC = 0;
        int contCP = 0;
        String opc;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("cc - cadastrar conta corrente");
            System.out.println("cp - cadastrar conta poupança");
            System.out.println("ac - acessar conta corrente");
            System.out.println("ap - acessar a conta poupança");
            System.out.println("e - sair");
            opc = leString("");
        }
        while (!opc.equals("e"));
    }
}
