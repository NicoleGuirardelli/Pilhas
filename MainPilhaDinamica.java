package Pilhas;

public class MainPilhaDinamica {
    public static void main(String[] args) {
        PilhaDinamica pilha = new PilhaDinamica();
        pilha.exibir();
        pilha.empilhar(1);
       // pilha.exibir();
        pilha.empilhar(2);
        pilha.empilhar(3);
        pilha.empilhar(4);

        pilha.desempilhar();
        pilha.desempilhar();
//        pilha.desempilhar();
        pilha.desempilhar();


        pilha.exibir();

    }
}
