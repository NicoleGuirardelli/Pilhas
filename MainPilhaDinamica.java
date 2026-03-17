package Pilhas;

public class MainPilhaDinamica {
    public static void main(String[] args) {
        PilhaDinamica pilha= new PilhaDinamica();
        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);
        pilha.empilhar(4);
        pilha.empilhar(5);
        pilha.empilhar(6);
        pilha.empilhar(7);

        System.out.println("Elemento "+pilha.desempilhar()+" desempilhado");
        pilha.exibir();
        System.out.println("-Adicionando varios-");
        Integer[] vetor={10,12,13,14};
        System.out.println("Foram adicionados "+pilha.adicionarVarios(vetor)+" elementos");
        pilha.exibir();

        pilha.limpar();
        pilha.desempilhar();
        pilha.exibir();

        pilha.adicionarVarios(vetor);


        System.out.println("Existem "+pilha.contar()+" elementos");

        pilha.exibir();
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();

    }
}
