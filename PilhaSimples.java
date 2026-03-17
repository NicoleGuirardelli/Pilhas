package Pilhas;

public class PilhaSimples {
    String[] pilha;
    public PilhaSimples(int tamanho) {
        if(tamanho>0){
        this.pilha = new String[tamanho];
        }
        else{
            System.out.println("Não é possível criar Pilha com tamanho menor ou igual a 0");
        }
    }
    public void empilhar(String elemento) {
        if (!estaCheia()){
            for (int i = pilha.length - 1; i > 0; i--) {
                pilha[i] = pilha[i - 1];
            }
            pilha[0] = elemento;
        }

    }
    public String desempilhar() {
        if (!estaVazia()){
            String elementoRemovido= pilha[0];
            pilha[0] = null;
            for(int i=0; i <pilha.length-1; i++) {
                pilha[i]=pilha[i+1];
            }
            return elementoRemovido;
        }
        return null;
        //retorna talvez uma execeção
    }


    private boolean estaVazia(){
        for (int i = 0; i < this.pilha.length; i++) {
            if (this.pilha[i] != null) {
                return false;
            }
        }
        System.out.println("A pilha está vazia");
        return true;
    }

    private boolean estaCheia(){
        for(int i=0;i< pilha.length;i++){
            if(pilha[i]==null){
                return false;
            }
        }
    System.out.println("A pilha esta cheia ");
        return true;
    }
    public void exibir(){
        for(int i=0;i< pilha.length;i++){
            System.out.println(pilha[i]);
        }
    }

}
