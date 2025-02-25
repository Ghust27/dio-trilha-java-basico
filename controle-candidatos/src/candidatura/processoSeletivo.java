package candidatura;

public class processoSeletivo{
    public static void main(String [] args){
        System.out.println("processo seletivo");
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar com contra proposta");
        }else{
            System.out.println("Aguardando demais candidatos");
        }
    }
}