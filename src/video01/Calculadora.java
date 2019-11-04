/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video01;

import java.util.Scanner;

/**
 *
 * @author WillB
 */
public class Calculadora {
    
     public static void main(String[] args) {
	 
	 //Declaração de variáveis
	 int x, y;
	 int soma, sub, mult, div;
	 Scanner valor = new Scanner(System.in);
	 
	 /**
	  * Entrada de Dados , onde vai receber o que o usuario digitar no console
	  */
	
	 System.out.print("Digite o valor x: ");
	 x = valor.nextInt( );   // quando for valores numéricos usar int ou float... Line somente para Strings
	 System.out.print("Digite o valor y: ");
	 y = valor.nextInt( ); 
	 
	 
	 /**
	  * Processamento
	  */
	 soma = x+y;
	 sub = x-y;
	 mult = x*y;
	 div = x/y;
	 
	 
	 System.out.println("A soma de x e y é:  " + soma);
	 System.out.println("A subtração de x e y é: " + sub );
	 System.out.println("A multiplicação de x e Y é :" + mult);
	 System.out.println("A divisão de x e y é: " + div);
	 
	 
	 
    }
}
