import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("qual o saldo inicial da conta?");
        double saldo = scanner.nextDouble();

        System.out.println("Qual o valor da primeira transacao? ");
        double primeiraTransacao = scanner.nextDouble();
        System.out.println("Qual o valor da segunda transacao? ");
        double segundaTransacao = scanner.nextDouble();
        System.out.println("Qual o valor da terceira transacao? ");
        double terceiraTransacao = scanner.nextDouble();

        double novoSaldo = calcularNovoSaldo(saldo,primeiraTransacao,segundaTransacao,terceiraTransacao);
        System.out.println(novoSaldo);
    }
    public static double calcularNovoSaldo(double saldo, double primeiraTransacao, double segundaTransacao, double terceiraTransacao){
        double novoSaldo = saldo + primeiraTransacao + segundaTransacao + terceiraTransacao;
        return novoSaldo;
    }
}
