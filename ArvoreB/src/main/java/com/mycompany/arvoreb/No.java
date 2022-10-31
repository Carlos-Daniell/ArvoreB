package com.mycompany.arvoreb;
/**
 *
 * @author Carlos Daniel Dos Santos Silva && Riane Martinelli Tozi
 */
public class No {
     public int valor; // Guarda valor do no
     public No esquerdo;
     public No direito;
     
     //Construtor  1
     public No(int valor){
         this.valor = valor; //Recebe o valor por parametro e passa pro atributo da classe
         this.esquerdo = null;
         this.direito = null;
     }
     //Construtor 2
     public No (int valor, No esquerdo, No direito){
         this.valor = valor;
         this.esquerdo = esquerdo;
         this.direito = direito;
     }
     
     
    
}
