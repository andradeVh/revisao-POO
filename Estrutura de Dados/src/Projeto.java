import java.util.ArrayList;

public class Projeto{
    private Gerente gerente;
    private String nomeProjeto;
    private ArrayList<Funcionario> funcionarios;
    private double custoTotal = 0;
    private boolean projetoFinalizado = false;

    public Projeto(Gerente gerente, String nomeProjeto){
        this.gerente = gerente;
        this.nomeProjeto = nomeProjeto;
    }

    public void setGerente(Gerente gerente){
        this.gerente = gerente;
    }

    public void setNomeProjeto(String nomeProjeto){
        this.nomeProjeto = nomeProjeto;
    }

    public Gerente getGerente(){
        return this.gerente;
    }

    public String getNomeProjeto(){
        return this.nomeProjeto;
    }

    public double calcularCustoTotal(){
        custoTotal = gerente.getSalario();
        for(Funcionario funcionario : funcionarios){
            custoTotal += funcionario.getSalario();
        }
        custoTotal += gerente.getSalario(); 
        return custoTotal;
    }

    public int qtdFuncionarios(){
        return funcionarios.size();
    }

    public boolean finalizarProjeto(){
        this.projetoFinalizado = true;
        return this.projetoFinalizado;
    }

    public double calcularBonusGerente(){
        if (projetoFinalizado){
            return gerente.getSalario() * 0.1 * (qtdFuncionarios() + 1);
        } else {
            return gerente.getSalario() * 0.1 * qtdFuncionarios();
        }
    }

    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public String toString(){
        String info = "Projeto: " + nomeProjeto + "\n";
        info += "Gerente: " + gerente.getNome() + "\n";
        info += "Funcionarios: \n";
        for(Funcionario funcionario : funcionarios){
            info += funcionario.getNome() + "\n";
            info += "Salario: " + funcionario.getSalario() + "\n";
        }
        info += "Custo Total: " + calcularCustoTotal() + "\n";
        return info;
    }


}