/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvdowl;

import java.util.Scanner;

/**
 *
 * @author gustavowz
 */
public class AtvDowl {
  // com explicaçoes com o meu entendimento  para mim e para quem ver 
    public static void main(String[] args) {
      
        Scanner scanner= new Scanner(System.in);// para o usuario introduzir informaçao
       System.out.println("------MEU MENU------");// so pra enfeitar
       System.out.println("Digite um numero respectivo a uma das opçoes seguintes: ");
        System.out.print("1.Adicionar  2.Remover  3.Sair: ");// como o exercicio pediu
    
        int N= scanner.nextInt();// jogando a informaçao do usuario para uma variavel
    
     do{//  no do-while o looping é feito pelo menos uma vez independente do valor booleano ser true ou false
      
         System.out.println("O numero digitado foi: "+N);//mostrando o valor digitado junto com a variavel do ususario
          System.out.print("Digite outro numero por favor:  ");//pedindo
            N= scanner.nextInt(); //ganhando mais um valor até o usuaro digitar 3
        }
     while(N !=3);// a condiçao vem depois no do-while, nestacondiçao o looping vai ser repetido por enquanto que n for diferente de 3, o sinal de exclamaçao mostra o operador de diferente
     
         
     
   
     
     System.out.print("Voce digitou 3, fim da sequencia");
     
     scanner.close(); // fechando scanner
   }
}

