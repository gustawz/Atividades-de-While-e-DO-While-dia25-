/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvdowl2;

import java.util.Scanner;

/**
 *
 * @author gustavowz
 */
public class AtvDowl2 {
  // com explicaçoes com o meu entendimento  para mim e para quem ver 
    public static void main(String[] args) {
        System.out.println("Digite uma temperatura: ");
        Scanner scanner= new Scanner(System.in);
        int contador=0;
        int Celsius=scanner.nextInt();
        do{ //looping
           int fahrenheit=(Celsius*9/5)+32;// a variavel vai receber o resultado do numero que o ususario colocou depois desse conta toda 
           System.out.println(Celsius+"°"+"Graus Celsius sao: "+fahrenheit+" em fahrenheit."); 
           
            System.out.println("Digite uma temperatura: ");
            
            Celsius=scanner.nextInt();
        }
        while(Celsius !=0);// condiçao, enquanto o numero que  o usuario colocar for diferente de 0, tudo ira se repetir, o sinal de exclamaçao mostra operador de diferente
        scanner.close();// fechando o scanner
    }
}
