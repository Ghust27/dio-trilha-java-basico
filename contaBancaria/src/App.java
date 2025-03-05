import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem-vindo ao nosso banco!");
        int opcao = -1;
        Scanner scanner = new Scanner(System.in);
        Operacoes operacoes = new Operacoes();
        System.out.println("Qual sera o saldo inicial da sua conta?");
        double saldoInicial = scanner.nextDouble();
        operacoes.CriacaoContaBancaria(saldoInicial);
        while (opcao !=0){
            try{
                System.out.println("ESCOLHA UMA DAS OPÇÕES ABAIXO:");
                System.out.println("1 - Consultar saldo");
                System.out.println("2 - consultar cheque especial");
                System.out.println("3- Depositar dinheiro;");
                System.out.println("4 - Sacar dinheiro;");
                System.out.println("5- Pagar um boleto.");
                System.out.println("6 - Verificar se a conta está usando cheque especial.");
                System.out.println("Digite 0 para finalizar o programa!");
                opcao = scanner.nextInt();
            }catch(Exception e){
                System.out.println("Escolha uma opção valida!");
            }
        switch (opcao) {
            case 0:
                break;
            case 1:
                operacoes.checkarSaldo();
                break;
            case 2:
                operacoes.checkarCheque();
                break;
            case 3:
                System.out.println("Qual o valor que deseja depositar?");
                double valorDeposito = scanner.nextDouble();
                operacoes.depositarSaldo(valorDeposito);
                break;
            case 4:
                System.out.println("Qual o valor que você deseja sacar?");
                double valorSaque = scanner.nextDouble();
                operacoes.sacarSaldo(valorSaque);
                break;
            case 5:
                System.out.println("Qual o valor do boleto?");
                double valorBoleto = scanner.nextDouble();
                operacoes.pagarBoleto(valorBoleto);
                break;
            case 6:
                operacoes.usandoChequeEspecial();
                break;
            default:
                System.out.println("Gostaria de realizar mais alguma operacao?");
                opcao = scanner.nextInt();
        }
    }
    }
}