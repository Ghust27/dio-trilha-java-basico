public class Operacoes {
    double saldo;
    double cheque;

    public void CriacaoContaBancaria(double saldo){
        this.saldo = saldo;
        if (saldo <= 500){
            this.cheque = -50;
        }else{
            this.cheque = -(this.saldo * 0.5);
        }
        System.out.println("Parabens! Conta criada com sucesso!");
    }

    public void checkarSaldo(){
        if(saldo < 0){
            System.out.println("O saldo é R$ 0.00");
            return;
        }
        System.out.println("Seu saldo é de: R$" + this.saldo);
    }

    public void checkarCheque(){
        if(this.saldo < 0){
            System.out.println("Seu cheque especial disponivel é de: R$" + (-this.cheque + this.saldo));
            return;
        }
        System.out.println("Seu cheque especial disponivel é de: R$" + (this.cheque * -1));
    }

    public void depositarSaldo(double saldo){
        this.saldo += saldo;
        System.out.println("Saldo no valor de: " + saldo + " depositado com sucesso!");
    }

    public void sacarSaldo(double saldo){
        if (saldo > this.saldo){
            System.out.println("Saldo solicitado foi maior que o saldo disponivel, nao foi possivel sacar.");
            return;
        }
        this.saldo -= saldo;
    }

    public void pagarBoleto(double valorBoleto){
        if (valorBoleto > (this.saldo + (this.cheque * -1))){
            System.out.println("Valor do boleto é maior que o saldo disponivel, nao foi possivel concluir operacao!");
            return;
        }
        this.saldo -= valorBoleto;
    }

    public void usandoChequeEspecial(){
        if (this.saldo < 0){
            System.out.println("Cheque especial esta sendo usado!");
            return;
        }
        System.out.println("Cheque especial nao esta sendo usado!");
    }
}
