import java.util.Scanner;

public class OhVida
{
    public static void main(String[] args)
    {
        int tempo;
        String universidade;
        Scanner scan = new Scanner(System.in);

        System.out.print("Onde voce estuda? ");
        universidade = scan.next();
        System.out.print("Ha quanto tempo? ");
        tempo = scan.nextInt();

        System.out.println("Voce estuda na " + universidade + " ha " + tempo + " anos.");
    }
}