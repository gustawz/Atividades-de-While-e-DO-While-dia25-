/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvdowl3;

import java.util.Scanner;

/**
 *
 * @author gustavowz
 */
public class AtvDowl3 {
  // com explicaçoes com o meu entendimento  para mim e para quem ver 
    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner scanner= new Scanner(System.in);
        int N=scanner.nextInt();
        
         do{//looping
             System.out.println(N--);// vai mostrar o numero que o usuario colocou e sempre tirar 1, assim formando a contagem regressiva até chegar em 0
         }
        while(N!=0);// enquanto o numero do usuario for diferente de 0, tudo ira se repetir
        
       scanner.close();
        
    }
}
