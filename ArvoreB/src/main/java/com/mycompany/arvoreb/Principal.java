package com.mycompany.arvoreb;
import java.util.Scanner;

/**
 *
 * @author Carlos Daniel Dos Santos Silva && Riane Martinelli Tozi
 */
public class Principal {

    public static void main(String[] args) {
        
         //Instancia objeto do Tipo ArvoreBinaria
        ArvoreBinaria ab = new ArvoreBinaria(50);
        //Adicionando na árvore
        ab.adicionaNo(new No(30), ab.getArvoreBinaria());
        ab.adicionaNo(new No(60), ab.getArvoreBinaria());
        ab.adicionaNo(new No(25), ab.getArvoreBinaria());
        ab.adicionaNo(new No(65), ab.getArvoreBinaria());
        ab.adicionaNo(new No(26), ab.getArvoreBinaria());

        ab. imprimirPosOrdem(ab.getArvoreBinaria());

    }

}

/*
        ESTAVA FAZENDO IMPLEMENTAÇÃO PARA RECEBER OS VALORES DO TECLADO.....

        Scanner primeiroNo = new Scanner(System.in);
        Scanner proximoNo = new Scanner(System.in);
        Scanner quantidade = new Scanner(System.in);

        //Tamanho da Árvore
        System.out.println("Digite o tamanho da arvore :  ");
        //Recebe do teclado
        int tamanho [] = new int[quantidade.nextInt()]; 

        //No Raiz
        System.out.println("Digite o primeiro valor : ");
        //Recebe do teclado
        int raiz = primeiroNo.nextInt();

        //Adiciona No, (valor do próximo nó)
        System.out.println("Digite o próximo valor : ");
        //Recebe do teclado
        int proximo = proximoNo.nextInt();

        //Instancia objeto do Tipo ArvoreBinaria
        ArvoreBinaria ab = new ArvoreBinaria(raiz);

        //Instacia de acordo com tamanho
        for (int i = 0; i = tamanho.length; i++) {
            ab.adicionaNo(new No(proximo), ab.getArvoreBinaria());
        }

        ab.adicionaNo(new No(30), ab.getArvoreBinaria());
        ab.adicionaNo(new No(60), ab.getArvoreBinaria());
        ab.adicionaNo(new No(25), ab.getArvoreBinaria());
        ab.adicionaNo(new No(65), ab.getArvoreBinaria());
        ab.adicionaNo(new No(26), ab.getArvoreBinaria());
 */
