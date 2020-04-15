package tad;
/**
 *
 * @author Siabreu
 */
public class Stack {
    private int []dados; // vetor para implementar a pilha
    private int topo;
    
    //construtor
    public Stack(int tamanho){
        dados = new int[tamanho];
        topo = -1; //a pilha está vazia
    }
    
    //empilhar
    public void push(int dado){
        if(isFull())
            throw new RuntimeException("==>Pilha Cheia!");
        dados[++topo] = dado;
    }
    
    //desempilhar
    public int pop(){
        if(isEmpty())
            throw new RuntimeException("==>Pilha Vazia!");
        return dados[topo--]; //retorna o topo e decrementa
    }
    
    //retorna o dado do topo
    public int peek(){
        if(isEmpty())
            throw new RuntimeException("==>Pilha Vazia!");
        return dados[topo];
    }
    
    //retorna a qtd de dados na pilha
    public int size(){
        return topo + 1;
    }
    
    //verifica se está vazia
    public boolean isEmpty(){
        return topo == -1;
    }
    
    //verifica se está cheia
    public boolean isFull(){
        return size() == dados.length; 
    }    
    
    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (int i = topo; i >= 0; i--) 
            saida.append(dados[i]).append("\n");                    
        return saida.toString();
    }    
}
