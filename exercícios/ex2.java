package facul_java;

class Programa{
    public static void main(String[] args){
        Conta minhaconta;
        minhaconta = new Conta();

        minhaconta.titular = "Jorge";
        minhaconta.numero = 1000;
        minhaconta.saldo = 150;

        minhaconta.saca(50);

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
	
}