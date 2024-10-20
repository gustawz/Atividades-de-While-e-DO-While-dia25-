/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tentativawl3;

import java.util.Scanner;

/**
 *
 * @author gustavowz
 */
public class Tentativawl3 {

    public static void main(String[] args) {
        // com explicaçoes com o meu entendimento  para mim e para quem ver 
        
        Scanner scanner= new Scanner(System.in); // para o ususario colocar uma informaçao
        
        System.out.println("Adivinhe um numero entre 1 e 100: ");// o que sera mostrado
        
        int tentativa=scanner.nextInt();// lendo os dados do ususario
        
        int tentativacerta=33;// o numero que eu quero q o usuaro acerte
        
        int contador=1;// para contabilizar oda vez que o usuario errar
        
        while(tentativa !=tentativacerta){// whle seria um "enquanto", ou seja, enquanto o numero da tentatva do usuario for diferente(sinalizado pelo operador !) do numero que eu coloquei(33), ira rodar o bloque do while inteiro
               
            
            if(tentativa >33){ // if seria "se", ou seja, se o numero do usuario for maior que 33 ira execultar o resto do bloco
            
                System.out.println("Numero muito alto! Tente  novamente");
                
                tentativa=scanner.nextInt(); // pedindo outro umero ao usuario
                    
             }
             
              if(tentativa <33)  { //if seria "se", ou seja, se o numero do usuario for menor que 33 ira execultar o resto do bloco
                  
                  System.out.println("Numero muito BAIXO! Tente  novamente");
               
                  tentativa=scanner.nextInt(); // pedindo novamente ao ususario um numero novo
              }
              
            
              contador++; // cada vez que o bloco do while inteiro for rodado ira adicionar +1 ao contador
              
    }
        
        
        System.out.println("Voce acertou! O numero era 33!"); //assim que o valor booleano sair de false para true ele ira chegar aqui e execultar essa parte
        
        System.out.print("Voce tentou: "+contador+" vezes");// mostrando quantas vezes foi executado o bloco while
        
    scanner.close();//fechando o scanner que eu sempre esuqeço kkkkk
        
    }
}
