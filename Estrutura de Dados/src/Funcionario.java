public class Funcionario{
    private int id;
    private double salario;
    private String nome;

    public Funcionario(int id, double salario, String nome){
        this.id = id;
        this.salario = salario;
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public int getId(){
        return this.id;
    }
}