/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video05;

import java.util.Scanner;


public class Calculadora_Video05 {
    
    static int x;
    static int y;
    static int soma;
    static int sub;
    static int mult;
    static int div;
    
   
    public static void soma() {    

	int soma;

	soma = x + y;
	System.out.println("----> O valor da soma das variáveis x e y [dentro do método soma]  é: " + soma);
    } // fecha o metodo soma()

    public static void sub() {

	int sub;
	
	
	sub = x - y;
                System.out.println("----> A subtração de x e y dentro do método [sub] é : " + sub);
    }

    public static void mult() {
	
	int multiplicacao;

	
	multiplicacao = x * y;
	System.out.println("----> A multiplicacao de x e y dentro do método [mult] é : " + multiplicacao);
    }

    public static void div() {

	
	float div;  
	
	div = x / y;
	System.out.println("----> A divisão de x e y  dentro do método [div] é : " + div);
    }
    
}
