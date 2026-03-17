package Pilhas;
public class PilhaDinamica {
    private NoInteiro inicio;
   
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
        if(this.inicio==null&&!estaVazia()){
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
    public int contar(){
        NoInteiro aux= this.inicio;
        int conta=0;
        while(aux!=null){
            conta++;
            aux= aux.getProx();
        }

        return conta;
    }

    public int adicionarVarios(Integer[] elemento){
        for(Integer element: elemento){
            this.empilhar(element);
        }
        return elemento.length;
    }
    public void limpar(){
        this.inicio= new NoInteiro(null);
        System.out.println("Pilha limpa");
    }


}
