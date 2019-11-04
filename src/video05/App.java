/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video05;

import java.util.Scanner;

/**
 *Percebe-se que agora temos duas classes distintas onde os atributos estão na classe Calculadora 
 * e a classe App vai chamar os atributos e eventos de cada método da classe Calculadora
 * 
 * @author WillB
 */
public class App {
    
     public static void main(String[ ] args) {   
              
	
	 
	
	Scanner valor = new Scanner(System.in);  

	
	System.out.print("Digite o valor de x: "); 
	/** Nessa classe não temos a variável x e y declaradas na classe main, elas estão na classe que iremos chamar. 
	 * Para chamá-las temos que colocar antes de cada variável o nome da classe onde elas se encontram, no caso será:
	 * Calculadora_Video05.x = valornextInt();
	 * 
	 */
	Calculadora_Video05.x = valor.nextInt();  
	
	System.out.print("Digite o valor de y: ");
	Calculadora_Video05.y = valor.nextInt();

	
	/**
	 * Para chamar os métodos em outras classe faremoas a mesma coisa:
	 * chamaremos a classe antes do método seguido de pontofincado assim:
	 * Ex : Calculadora_Video05.soma();
	 * 
	 */
	Calculadora_Video05.soma();
	Calculadora_Video05.sub();
	Calculadora_Video05.mult();
	Calculadora_Video05.div();
    
}
     
}
