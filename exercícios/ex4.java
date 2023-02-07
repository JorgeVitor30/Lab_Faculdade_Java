
class main {
    public static void main(String[] args) {
    caixa pessoa1;
    pessoa1 = new caixa();
    
    pessoa1.nome = "Jorge";
    pessoa1.saldo = 1000;
    pessoa1.limite = 5000;
    
    if (pessoa1.saca(4500)){
        System.out.println(pessoa1.nome + " Sacou com sucesso");
    }
    else{
        System.out.println(pessoa1.nome + " Nao conseguiu sacar");
    }
    
    }
    
    
}

class caixa {
    float saldo;
    float limite;
    String nome; 
    
    void deposito(float quantidade){
        this.saldo += quantidade;
        
    }
    
    boolean saca(float quantidade){
        if (quantidade < saldo){
            this.saldo -= quantidade;    
            return true;
        }
        else{
            return false;
            
        }
        
    }
    
}
