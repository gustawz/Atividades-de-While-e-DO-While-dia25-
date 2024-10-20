/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tentativa4wl;

import java.util.Scanner;

/**
 *
 * @author gustavowz
 */
public class Tentativa4wl {

    public static void main(String[] args) {
          // com explicaçoes com o meu entendimento  para mim e para quem ver 
        Scanner scanner= new Scanner(System.in);//para ler o numero do usuario
        System.out.print("DIgite um numero:  ");
        int N= scanner.nextInt();//jogando o numero do ususario para uma variavel
        int par=0;
        int impar=0;
        int numeroinicial=1; //todas variaveis recebendo um valor
        
        while(numeroinicial <=N){// enquanto numero inicial for menor ou igual a o numero do usuario, ira execultar o resto do bloco
            
            if(numeroinicial % 2== 0){ // if seria "se",entao, se o numeroinicial dividido por 2 for igual a 0...
                
            par++;   // adiciona 1 a variavel par 
                
            }
            else {//else seria "se nao", logo, se nao 
               impar++; // adiciona 1 a variavel impar
               
               
             }
           numeroinicial++; // adiciona 1  a variavel a cada vez que o looping é rodado
        }
        
         System.out.println("Numeros pares:"+par);
         System.out.println("Numeros impares:"+impar);
         scanner.close();
    }
}
