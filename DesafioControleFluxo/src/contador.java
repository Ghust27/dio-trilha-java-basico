import java.util.Scanner;

public class contador {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual o primeiro numero?");
        int primeiroNumero = scanner.nextInt();
        System.out.println("qual o segundo numero?");
        int segundoNumero = scanner.nextInt();

        try{
            contar(primeiroNumero, segundoNumero);
        }catch (ParametrosInvalidosException e){
            System.out.println("Erro " + e.getMessage());
        }
    }
    public static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException{
        if (primeiroNumero >= segundoNumero){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int quantidade = segundoNumero - primeiroNumero;
        for(int i = 1; i <= quantidade; i++){
            System.out.println("imprimindo o numero: " + i);
        }
    }
}
