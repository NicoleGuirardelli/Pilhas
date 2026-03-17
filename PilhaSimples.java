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
            pilha[pilha.length - 1] = null;//evita que o ultimo elemento fique duplicado
            return elementoRemovido;
        }
        return null;

    }


    private boolean estaVazia(){
        for (String elemento : this.pilha) {
            if (elemento != null) {
                return false;
            }
        }
        System.out.println("A pilha está vazia");
        return true;
    }

    private boolean estaCheia(){
        for (String elemento : pilha) {
            if (elemento == null) {
                return false;
            }
        }
    System.out.println("A pilha esta cheia ");
        return true;
    }
    public void exibir(){
        for (String elemento : pilha) {
            System.out.println(elemento);
        }
    }
    public int contar(){
        int contar=0;
        for(int i=0;i<pilha.length;i++){
            if(pilha[i]!=null){
                contar++;
            }else{
                return contar;
            }

        }
        return contar;
    }
    public int adicionarVarios(String[] elementos){
        int adicionado = 0;
        for (String elemento : elementos) {
            if (estaCheia()) {
                break;            // se a pilha estiver cheia sai do laço
            }
            empilhar(elemento);
            adicionado++;
        }

        return adicionado;
    }
    public void limpar(){
        for(int i=0;i<pilha.length;i++){
            pilha[i]=null;
        }
        System.out.println("Pilha limpa ");
    }

}
