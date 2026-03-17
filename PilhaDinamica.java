package Pilhas;
public class PilhaDinamica {
    private NoInteiro inicio;
   // private int tamanho=0;
    public PilhaDinamica() {
       this.inicio= new NoInteiro(null);
    }

    public void empilhar(Integer elemento){
        if(estaVazia()){
            this.inicio.setConteudo(elemento);
            return;
        }
       NoInteiro novo = new NoInteiro(elemento);
       novo.setProx(this.inicio);
       this.inicio=novo;
    }

    public Integer desempilhar(){
        if(!estaVazia()){
        Integer elementoRemovido= this.inicio.getConteudo();
        this.inicio=this.inicio.getProx();
        return elementoRemovido;
        }
        return null;
    }

    public void exibir(){
        if(!estaVazia()){
            NoInteiro aux= this.inicio;

            while(aux!= null){
                System.out.println(aux.getConteudo());
                aux= aux.getProx();
            }

        }

    }
    private boolean estaVazia(){
       if( this.inicio.getConteudo()==null){
          // System.out.println("A pilha está vazia");
           return true;
       }
       return false;
    }


}
