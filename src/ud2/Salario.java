package ud2;

import java.util.Scanner;

public class Salario 
{

	public static void main(String[] args) 
	{
		salario();
	}
	
	//Pide los trabajadores//
	////////////////////////////////////////////////////
	public static int trabajadores() 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero de trabajadores:");
		int trabajadores = entrada.nextInt();
		if(trabajadores == 0) 
		{
			System.err.println("No hay ningun trabajador");
			trabajadores = errorT();
		}
		return trabajadores;

	}
	
	//Pide la tarifa//
	/////////////////////////////////////////////////////
	public static double tarifa() 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la tarifa ordinaria por hora:");
		double tarifa = entrada.nextDouble();
		if(tarifa <= 0) 
		{
			System.err.println("No puden cobrar menos de 0 euros");
			tarifa = errorTa();
		}
		return tarifa;
	}
	
	//Si no hay trabajadores los vuelve a pedir//
	/////////////////////////////////////////////////////
	public static int errorT() 
	{
		Scanner entrada = new Scanner(System.in);
		int trabajadores = 0;
		while(trabajadores == 0) 
		{
			System.err.println("Vuelve a introducir el numero de trabajadores:");
			trabajadores = entrada.nextInt();
		}
		return trabajadores;
	}
	
	//Si la tarifa es 0 o menos la vuelve a pedir//
	/////////////////////////////////////////////////////
	public static double errorTa() 
	{
		Scanner entrada = new Scanner(System.in);
		double tarifa = 0;
		while(tarifa <= 0) 
		{
			System.err.println("Vuelve a introducir la tarifa:");
			tarifa = entrada.nextInt();
		}
		return tarifa;
	}
	
	//Si las horas son 0 las vuelve a pedir//
	//////////////////////////////////////////////////////
	public static int errorH() 
	{
		Scanner entrada = new Scanner(System.in);
		int horas = 0;
		while(horas < 38 ) 
		{
			System.err.println("Vuelve a introducir las horas trabajadas:");
			horas = entrada.nextInt();
		}
		return horas;
	}
	
	//Pide las horas//
	/////////////////////////////////////////////////////
	public static int horas(int numero) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuantas horas trabaja el trabajador " + numero + ": ");
		int horas = entrada.nextInt();
		if(horas < 38) 
		{
			System.err.println("No se puede trabajar menos de 38 horas");
			horas = errorH();
		}
		return horas;
	}
	
	//Calcula el salario//
	/////////////////////////////////////////////////////
	public static double salario() 
	{
		double salario = 0;
		double salariob = 0;
		boolean valor = false;
		int numero = 1;
		
		Scanner entrada = new Scanner(System.in);
		int trabajadores = trabajadores();
		double tarifa = tarifa();
		
		while (!valor) 
		{
			
			for(int i = 0; i <  trabajadores; i++) 
			{
				int horas = horas(numero);
				int horasp = horas;
				
				if( horas == 38) 
				{
					salario = tarifa * horas;
				}
				else 
				{
					double horase = horas - 38;
					salario = (horase * tarifa * 1.5) + (38 * tarifa);	
				}
				
				if (salario <= 600) 
				{
					salariob = salario;
				}
				else if(salario > 600 && salario <= 1200) 
				{
					salariob = salario;
					salario = salario - 600;
					salario = (salario * 0.75) + 600;
						
				}
				else if (salario > 1200)
				{
					salariob = salario;
					
					salario = salario - 1200;
					salario = salario * 0.55;
					salario = salario + 1050;
					
				}	
				System.out.println("El salario bruto por semana del trabajador " + numero + " con " + horasp + " horas trabajadas es " + salariob + "€");
				System.out.println("El salario neto por semana del trabajador " + numero + " con " + horasp + " horas trabajadas es " + salario + "€");
				System.out.println();
				numero++;
			}
			valor = true;
		}
		System.out.println();
		System.out.println("Fin del programa");
		return salario;	
	}
		
		
	
}