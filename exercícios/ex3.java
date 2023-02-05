package exercícios;

class Programa{
    public static void main(String[] args){
        Conta minhaconta;
        minhaconta = new Conta();

        minhaconta.titular = "Jorge";
        minhaconta.numero = 1000;
        minhaconta.saldo = 150;

        minhaconta.saca(50);
        minhaconta.depositar(150);
        minhaconta.emprestimo(1000);

        System.out.println("Saldo: " + minhaconta.saldo);

    }
}


/* CLASSE */
class Conta{
	int numero;
	String titular;
	double saldo;

    /* MÉTODO */
    void saca(double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;

    }
    void depositar(double quantidade){
        this.saldo += quantidade;
    }
    
    void emprestimo(double quantidade){
        if (quantidade < 5 * this.saldo){
            this.saldo -= quantidade;
        } 
    }

	
}
