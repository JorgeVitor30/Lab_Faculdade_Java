public class Funcionario {
    
    private String nome;
    private String cpf;
    private double salario;
    private double ch;          /* carga horária */


    Funcionario(String nome, String cpf, double salario, double ch){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.ch = ch;
    }

    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public double getSalario(){
        return this.salario;
    }
    public double getCh(){
        return this.ch;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setNome(double ch){
        this.ch = ch;
    }

    public void extra(double ch, String nome){
        if(ch > 160){
            this.salario += (25*(ch-160));
        }else if(ch == 160){
            System.out.println("Você cumpriu sua carga horária! " + this.salario);
        }
        else{
            this.salario += (25*(ch-160));
        }

    }
