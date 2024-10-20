/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tentativawl;

import java.util.Scanner;

/**
 *
 * @author gustavowz
 */
public class Tentativawl {

 
    public static void main(String[] args) {
         // com explicaçoes com o meu entendimento  para mim e para quem ver 
        
        int contadorposi = 0; // de inico era pra ser um contador
        Scanner scanner = new Scanner(System.in); //usado para o usuario introduzir informaçao no codigo, seria uma intereçao externa entre a maquina e o usuario em vez somente de maquina e codigo

        System.out.println("Digite um numero: "); // ira mostrar o que esta entre as aspas
        int numusuario = scanner.nextInt(); // a variavel numusario ira receber o numero que o usuario colocou(para "puxar" o valor que o usuario introduziu é necessario o scanner.nextInt, sendo o que esta antes do ponto ser o nome do meu scanner que é definido na segunda palara do scanner la em cima)

     
       if (numusuario <= 0) { //if é "se", entao, se numero do usuario for menos ou igual a zero, irá realizar o bloo abaixo, cao nao, ira seguir o resto do codigo
           
            System.out.println("Este número é negativo ou nulo (0), fim da sequência");
            return; // retorna
        }

        
        while (numusuario >= 1) { // while seria um "enquanto", entao, enquanto numero do usuario for maor ou igual a 1 irá execultar o resto do processo abaixo
            
            contadorposi += numusuario;// contadorposi ira somar o valor que esta dentro da variavel numusuario e logo depois receber o valor que foi somado

            System.out.print("Digite um numero: "); // pedindo mais numero jaq ue o processo nao deu falso, ou seja, o numero que foi introduzido até aq ainda é maior ou igual a 1
            numusuario = scanner.nextInt();//recebendo o valor que o usuario vai colocando
        }

     
        System.out.println("Este número é negativo ou nulo (0), fim da sequência");//assim que o processo do while der false, ou seja, o numero nao ser maor ou igual a 1, ele encerra o cogigo e mostra as informaçoes que voce pediu no system.out.print
        System.out.println("A soma dos números positivos é: " + contadorposi);// mostra sua menssgem e mais o valor contido na variavel e sim, o + é preciso se quiser justar informaçoes separaras 
      scanner.close();    
    }
}
