package com.mycompany.arvoreb;

/**
 *
 * @author Carlos Daniel Dos Santos Silva && Riane Martinelli Tozi
 */
public class ArvoreBinaria {

    //Objeto do tipo (No)
    No raiz;

    //Construtor da arvore
    public ArvoreBinaria(int valor) {
        raiz = new No(valor);

    }

    //Retorna minha raiz
    public No getArvoreBinaria() {
        return raiz;
    }
    
    //Metodo recursivo (add nó)
    // NUMEROS MAIORES PARA O LADO DIREITO E MENORES PARA O LADO ESQUERDO
    public void adicionaNo(No novoNo, No raiz) {
        //Quando o nó é maior que a raiz analisada
        if (novoNo.valor > raiz.valor) {
            //se existir filho direito, não passa no if
            if (raiz.direito != null) {
                adicionaNo(novoNo, raiz.direito);
            } else {
                raiz.direito = novoNo;
            }
            //Quando o nó é menor que a raiz
        } else {
            //verdadeiro, entra se existir filho esquerdo
            if (raiz.esquerdo != null) {
                adicionaNo(novoNo, raiz.esquerdo);
            } else {
                raiz.esquerdo = novoNo;
            }
        }
    }

    //Imprimir pós-ordem (EDR) Esquerda - Direita - Raiz
    public void imprimirPosOrdem(No raiz) {
        if (raiz == null) {
            return;//Parada
        } else {
            imprimirPosOrdem(raiz.esquerdo);  //Anda até a ultima folha esquerda
            imprimirPosOrdem(raiz.direito);//Vai na folha direita
            System.out.print(raiz.valor + "\t");//Imprime o valor
        }
    }

}
