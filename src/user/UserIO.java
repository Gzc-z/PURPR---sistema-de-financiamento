package user;

import java.util.Scanner;

public class UserIO{
    static Scanner scan = new Scanner(System.in);
    static double valor;
    static int prazo;
    static double taxa;

    public static boolean verify(double data, long max){
        if(data < 0 || data > max){
            System.out.print("\nvalor ilógico!! insira novamente os dados!!\n");
            return false;
        }
        return true;
    }
    public static boolean verify(int data, long max){
        if(data < 0 || data > max){
            System.out.print("\nvalor ilógico!! insira novamente os dados!!\n");
            return false;
        }
        return true;
    }

    public static double valor(){
        long MaxValue = 99999999999L;
        do {
            System.out.print("\nvalor do imóvel: "); // n faço idéia de um valor maximo ent coloquei 100M
            UserIO.valor = scan.nextDouble();
        } while (verify(valor, MaxValue) == false);
        return valor;
    }

    public static int prazo(){
        do{
            System.out.print("prazo do financiamento (max: 45 anos): "); // prazo de 45 anos no maximo
            UserIO.prazo = scan.nextInt();
        } while (verify(prazo, 45) == false);
        return prazo;
    }

    public static double taxa(){
        do{
            System.out.print("taxa de juros anual (max: 25): "); // limite maximo de 25... o dobro da média do mercado
            UserIO.taxa = scan.nextDouble();
        } while (verify(taxa, 25) == false);
        return taxa;
    }
}
