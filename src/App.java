import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int ano = Integer.parseInt(entrada.nextLine());
        int idadeEsseAno = 2022 - ano;
        System.out.print("Este ano você faz " + idadeEsseAno + " anos.");
        entrada.close();
    }
}