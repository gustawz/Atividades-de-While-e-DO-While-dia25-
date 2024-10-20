/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvdowl4;

import java.util.Scanner;

/**
 *
 * @author gustavowz
 */
public class AtvDowl4 {

    public static void main(String[] args) {
          // com explicaçoes com o meu entendimento  para mim e para quem ver 
        System.out.println("Digite um numero: ");
        Scanner scanner= new Scanner(System.in);
        int N= scanner.nextInt();// recebendo o valor do usuario
       
        int impar=0;// iniciando com 0
       
        do{// primeiro looping
            
               
            if(N% 2== 1){// se o numero do usuario dps da conta ainda dor 1n entao é impar
                
             impar++; 
            }
              System.out.println("Digite um numero novamente(ou 0 para sair): ");//pedindo outro valor
             N= scanner.nextInt();//ganhando utro valor do ususario
            
        }
        while(N != 0);//condiçao, enquanto o numero do usuario for diferente de 0, tudo ira se repetir
         System.out.println("Numeros impares:"+impar);// resultado
         
         
         
        //Isso foi meu entendimento, se ta errado entao nao entendi(logicamente)
    }
}
