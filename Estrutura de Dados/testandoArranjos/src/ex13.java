public class ex13 {
    static void main() {
        VetorEstatico<Integer> vetor = new VetorEstatico<>(1000);

        vetor.inserirAleatorio(100);
        vetor.imprimir();
    }
}
