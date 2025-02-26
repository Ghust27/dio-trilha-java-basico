import java.util.Locale;
import java.util.Scanner;

public class Calculo {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("qual o valor bruto do salario? ");
        double salarioBruto = scanner.nextDouble();
        System.out.println("e qual o adicional dos beneficios? ");
        double adicionalBeneficios = scanner.nextDouble();
        calcularSalario(salarioBruto,adicionalBeneficios);
        
    }
    public static void calcularSalario(double salarioBruto, double adicionalBeneficios){
        double imposto = calcularImposto(salarioBruto,adicionalBeneficios);
        double salario = salarioBruto - (salarioBruto*imposto) + adicionalBeneficios;
        System.out.println(String.format("o salario a ser transferido sera de: R$%.2f", salario));
    }
    public static double calcularImposto(double salarioBruto,double adicionalBeneficios){
        if(salarioBruto <= 1100){
            return 0.05;
        }else if(salarioBruto <= 2500){
            return 0.1;
        }else{
            return 0.15;
        }

    }
}