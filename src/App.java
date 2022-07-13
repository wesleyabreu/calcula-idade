import java.util.Scanner;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int ano = Integer.parseInt(entrada.nextLine());
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int idadeEsseAno = anoAtual - ano;
        System.out.print("Este ano você faz " + idadeEsseAno + " anos.");
        entrada.close();
    }
}