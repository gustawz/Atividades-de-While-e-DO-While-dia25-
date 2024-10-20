/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tentativawl2;

import java.util.Scanner;

/**
 *
 * @author gustavowz
 */
public class Tentativawl2 {

    public static void main(String[] args) {
          // com explicaçoes com o meu entendimento  para mim e para quem ver 
        Scanner scanner = new Scanner (System.in);// o usuario introduzir um valor 
        
   
       System.out.print("Digite um numero: ");
       int contador=1;
        int nu= scanner.nextInt();// usuario e seu valor
        
        while(contador<=10){// while é "enquanto", ou seja, enquanto o contador for menor ou igual a 10
            int resultado= nu*contador;// a variavel ira receber o numero inserido pelo usuario e fazer multiplicacao com o numero contido no contador
            System.out.println( nu+"X"+contador+"="+resultado+".");// o + é usado para juntas duas menssgens ou variaveis diferentes, aqui mostrara o valor do usuario, contador e resultado
            contador++; //adiciona 1 ao contador a cada processo
        }
        
        scanner.close(); //fecha o scanner
        
        
        
        
        
        
    } 
        
}
