/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video05;

import java.util.Scanner;

/**
 *
 * @author WillB
 */
public class Calculadora_Video05 {
    
    static int x;
    static int y;
    static int soma;
    static int sub;
    static int mult;
    static int div;
    
    /**
     * Agora as variáveis locais foram retiradas inclusive as variáveis do metodo principal main,
     * e colocadas na classe, assim todos os métodos têm acesso a essas variáveis.
     * 
     * a unica coisa que fica dentro do método são as ações/eventos que esses métodos devem fazer.
     *  
     * @param args
     */
    
    
     public static void main(String[ ] args) {   // Sem o "static"  a classe deixa de ter o método principal

	
	 
	
	Scanner valor = new Scanner(System.in);  

	
	System.out.print("Digite o valor de x: ");
	x = valor.nextInt();
	System.out.print("Digite o valor de y: ");
	y = valor.nextInt();

	
	
	/**
	 * Quando as variáveis estão na classe eu não preciso passar os parâmetros. Eu faço isso quando preciso chamar um método dentro
	 * na main onde as variáveis estão na main... daí preciso declarar variáveis na main para receber as variáveis dos escopos dos outros métodos
	 */
	soma();
	sub();
	mult();
	div();

    } 
    public static void soma() {     //repare que não de valor entre os parênteses...sem parâmetros

	int soma;

	soma = x + y;

	System.out.println("----> O valor da soma das variáveis x e y [dentro do método soma]  é: " + soma);

    } // fecha o mpetodo soma()

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
