package app;

import java.util.Scanner;
import tad.Stack;



/**
 *
 * @author Siabreu
 */
public class AppConversaoDecimalBinario {
    public static void main(String[] args) {
        Stack pilhaBinario;  
        Scanner entrada = new Scanner(System.in);
        
        int decimal;
        //valida a entrada do decimal positivo maior que 0
        do{
            System.out.println("Digite um número decimal:");
            decimal = entrada.nextInt();
            if(! (decimal > 0) ){
                System.out.println("==> O decimal deve ser positivo!");                       
            }
        }while( ! (decimal > 0) );
        
        //Inicializa a pilha com o tamanho do decimal
        pilhaBinario = new Stack(decimal);
               
        System.out.println(conversao(pilhaBinario, decimal));
        
    }
    
    public static String conversao(Stack pilhaBinario, int decimal){
        //calcula o resto da divisão e empilha (push)
        while(decimal != 0){
            pilhaBinario.push( decimal%2 );
            decimal /= 2;
        }
        
        //desempilha (pop) e armazena na saida para retornar
        String saida = "==> Convertido para binário: ";        
        while(! pilhaBinario.isEmpty()){
            saida += pilhaBinario.pop();
        }
        return saida;
    }
}
