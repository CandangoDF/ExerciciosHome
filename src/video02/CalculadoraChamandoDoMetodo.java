/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video02;

import java.util.Scanner;

/**
 *
 * @author WillB
 */
public class CalculadoraChamandoDoMetodo {

    public static void main(String[] args) { // abre método main - Escopo da main
	 
	/**
	 * Agora vamos chamar o método "soma" para que ele possa ser executado
	 */ 
	soma();
	sub();
	mult();
	div();
	
	
	
    } // fecha metodo main

    public static void soma() {         //abre o método soma()  - Escopo do método soma

	int x, y;   // variáveis locais... fazem parte do escopo do método "soma".
	int soma;

	Scanner valor = new Scanner(System.in);
	System.out.print("Digite o valor de x: ");
	x = valor.nextInt();
	System.out.print("Digite o valor de y: ");
	y = valor.nextInt();

	soma = x + y;

	System.out.println("----> O valor da soma das variáveis x e y [dentro do método soma]  é: " + soma);

    } // fecha o mpetodo soma()
    
    
    public static void sub (){
	
	int x , y;    // variáveis locais... fazem parte do escopo do método "sub".
	int sub;
	
	Scanner valor = new Scanner(System.in);
	System.out.print("Digite x: ");
	x = valor.nextInt();
	
	System.out.print("Digite y: ");
	y = valor.nextInt();
	
	sub = x - y;
	
	
	System.out.println("----> A subtração de x - y dentro do método [sub] é : " + sub);
	
    }

    
    public static void mult(){
	int x , y;         // variáveis locais... fazem parte do escopo do método "mult".
	int multiplicacao;
	
	Scanner valor = new Scanner(System.in);
	System.out.print("Digite x: ");
	x = valor.nextInt();
	
	System.out.print("Digite y: ");
	y = valor.nextInt();
	
	multiplicacao = x * y;
	
	
	System.out.println("----> A multiplicacao de x * y dentro do método [mult] é : " + multiplicacao);
	
    }
    
    
    public static void div(){
	
	int x , y;       // variáveis locais... fazem parte do escopo do método "div".
	int div;
	
	Scanner valor = new Scanner(System.in);
	System.out.print("Digite x: ");
	x = valor.nextInt();
	
	System.out.print("Digite y: ");
	y = valor.nextInt();
	
	div = x / y;
	
	
	System.out.println("----> A divisão de x / y dentro do método [div] é : " + div);
    }
    
    
    
}



