import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do usuario");
        String nome = scanner.nextLine();

        System.out.println("Digite a senha do usuario");
        String senha = scanner.nextLine();

        System.out.println("Digite o email do usuario");
        String email = scanner.nextLine();

        System.out.println("Digite o cpf do usuario");
        Long cpf = scanner.nextLong();

        System.out.println("usuario: " + nome + " criado com sucesso");

    }
}
