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
        System.out.println("Digite um numero: ");
        Scanner scanner= new Scanner(System.in);
        int N= scanner.nextInt();
       
        int impar=0;
       
        do{
            
               
            if(N% 2== 1){
                
             impar++; 
            }
              System.out.println("Digite um numero novamente(ou 0 para sair): ");
             N= scanner.nextInt();
            
        }
        while(N != 0);
         System.out.println("Numeros impares:"+impar);
    }
}
