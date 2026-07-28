public class App {
    public static void main(String[] args) throws Exception {
       Gerente gerente = new Gerente(1, 5000, "João", 1000);
        Projeto projeto = new Projeto(gerente, "Projeto A");
        Funcionario funcionario1 = new Funcionario(2, 3000, "Maria");
        Funcionario funcionario2 = new Funcionario(3, 4000, "Pedro");

        projeto.adicionarFuncionario(funcionario1);
        projeto.adicionarFuncionario(funcionario2);


       System.out.println(projeto.toString());
    }
}
