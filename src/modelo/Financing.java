package modelo;

public class Financing{
    private double value;
    private int prazo;
    private double juros;

    public Financing(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.value = valorImovel;
        this.prazo = prazoFinanciamento;
        this.juros = taxaJurosAnual;
    }

    public double getValue(){ return value; }
    public int getPrazo(){ return prazo; }
    public double getJuros(){ return juros; }

    public void getData(){
        System.out.println("\ndados do financiamento:");
        System.out.println(String.format("valor do imóvel: %.2f R$", value));
        System.out.println(String.format("valor total: %.2f R$", totalPayCalc()));
    }

    public double mensalPayCalc(){
        double mensal = (value / (prazo * 12)) * (1 + (juros / 12));
        return mensal;
    }

    public double totalPayCalc(){
        double mensal = mensalPayCalc();
        double total = mensal * prazo * 12;
        return total;
    }
}
