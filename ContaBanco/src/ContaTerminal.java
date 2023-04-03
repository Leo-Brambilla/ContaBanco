import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da agência: ");
        String agencia = sc.next();

        System.out.println("Digite o número da conta: ");
        String conta = sc.next();

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.next();

        System.out.println("Digite o valor que deseja depositar para abrir a conta: ");        
        double saldo = sc.nextDouble();

        System.out.println("Bem vindo "+nome+" "+sobrenome+", sua agência é "+agencia+", e conta "+conta+" e o saldo atual é: R$"+saldo);
    }
}
