/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video03;

import java.util.Scanner;

/**
 *
 * @author WillB
 */
public class Calcuadora_Video03 {

    public static void main(String[] args) {

	/**
	 * Agora vamos tirar as variáveis de dentro dos métodos (variáveis
	 * locais) e transfrmá-las em variáveis de classe onde agora elas
	 * poderão ser usadas por todos os métodos.
	 *
	 * Instanciamos o objeto "Sacanner" fora dos métodos ... assi ele será
	 * chamado na classe principal "main"
	 */
	int x; //receberá as variáveis locais declaradas nos parâmetros dos métodos (soma, sub, mult e div).
                int y;
	Scanner valor = new Scanner(System.in);  // trago para classe principal a chamada de x e y

	/**
	 * Chamando duas variáveis x e y no método principal essas váriaveis tem
	 * um espaço na memória, mas são diferentes das variáveis criadas nos
	 * parâmetros dos métodos. Lá elas tem seus espaços na memórias também e
	 * nem precisam ter o mesmo nome
	 */
	System.out.print("Digite o valor de x: ");
	x = valor.nextInt();
	System.out.print("Digite o valor de y: ");
	y = valor.nextInt();

	soma(x, y); // aqui "x recebe n1" e 'y recebe n2" do parâmetro soma. Isso é permitido pq as as variáveis ocupam espaços diferentes na memória.
	sub(x, y);
	mult(x, y);
	div(x , y);

    } // fecha metodo main

    /**
     * // variáveis do método local "soma, sub, mult e div" ... o valor de n1 e n2 será enviado para x e y da classe main
     *
     * @param n1 ocupam local próprio na memoria diferentes de x e y da classe main
     * @param n2 ocupam local próprio na memoria diferentes de x e y da classe main
     * main
     */
    public static void soma(int n1, int n2) {

	int soma;

	soma = n1 + n2; //varáveis declaradas dentro do parêmetro do método

	System.out.println("----> O valor da soma das variáveis n1 e n2 [dentro do método soma]  é: " + soma);

    } // fecha o mpetodo soma()

    public static void sub(int n1, int n2) {

	int sub;
	
	
	sub = n1 - n2;
                System.out.println("----> A subtração de n1 e n2 dentro do método [sub] é : " + sub);

    }

    public static void mult(int n1, int n2) {
	
	int multiplicacao;

	
	multiplicacao = n1 * n2;
	System.out.println("----> A multiplicacao de n1 e n2 dentro do método [mult] é : " + multiplicacao);

    }

    public static void div(float valor1 , int valor2) {

	
	float div;  //para que a divisão receba decimais é preciso declarar a variável da divisão e um do 
	// parâmetro com sendo float
	

	/**
	 * Reparem que mudei o nome da variável local para valor1 e valor2 ... os valores dessas variáveis
	 * será enviados para x e y da classe main... porém posso colocar qualquer nome aqui no método
	 * pq elas ocupam lugares diferentes na memória
	 */
	

	div = valor1 / valor2;
	System.out.println("----> A divisão de valor1 e valor2  dentro do método [div] é : " + div);
    }

}
