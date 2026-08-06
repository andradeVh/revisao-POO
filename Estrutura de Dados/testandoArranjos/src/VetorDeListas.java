

public class VetorDeListas {

    private VetorEstatico[] nomesporletra;

    public VetorDeListas() {
        nomesporletra = new VetorEstatico[26];
        for (int i = 0; i < nomesporletra.length; i++){
            nomesporletra[i] = new VetorEstatico(20);
        }
    }

    public void inserir(String nome){
        // if tamanho < bla bla
        char letra = Character.toUpperCase(nome.charAt(0));
        int indice = letra - 'A';

        nomesporletra[indice].inserir(nome);

    }

    public void imprimir(){
        for (int i = 0; i < 26; i++){
            char letra = (char) ('A' + i);
            System.out.print(letra + " ");
            nomesporletra[i].imprimir();
        }
    }
}