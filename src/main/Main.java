package main;

import java.util.ArrayList;

import user.UserIO;
import modelo.Financing;

public class Main{
    static double valor;
    static int prazo;
    static double taxa;
    static Financing finan;

    static double totalImoveis;
    static double totalFinan;

    public static void main(String[] args){
        ArrayList<Financing> financiamentos = new ArrayList<>();
        do {
            valor = UserIO.valor();
            prazo = UserIO.prazo();
            taxa = UserIO.taxa();
            finan = new Financing(valor, prazo, taxa);
            financiamentos.add(finan);
        } while (financiamentos.size() < 4);

        System.out.println("-".repeat(22));
        for (Financing data : financiamentos){
            data.getData();
            totalImoveis += data.getValue();
            totalFinan += data.totalPayCalc();
        }
        System.out.printf("=".repeat(22), totalImoveis);
        System.out.printf("\ntotal imóveis - %.2f R$\n", totalImoveis);
        System.out.printf("total financiamentos - %.2f R$", totalFinan);
    }
}
