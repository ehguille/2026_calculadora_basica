package calculadorabasica;

import java.util.Scanner;

public class Aplicacion {

	public Aplicacion() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Vamos a operar con dos números. Introduce el primero:");
		int a=s.nextInt();
		System.out.println("Introduce otro número entero:");
		int b=s.nextInt();
		
		Calculadora unaCalculadora=new Calculadora();
		int resultado=unaCalculadora.sumar(a, b);
		System.out.println("Resultado de la suma:"+resultado);
		
		resultado=unaCalculadora.restar(a, b);
		System.out.println("Resultado de la resta:"+resultado);
		
		//TODO: implementar multiplicación, división y poner ejemplos. Hacer métodos que puedan usar 3 operadores (sobrecargar los métodos).
		s.close();
	}
	
	public static void main(String[] args) {
		Aplicacion a=new Aplicacion();

	}

}
