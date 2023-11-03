package ejercicios;

import javax.swing.JOptionPane;

/*
En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500,
realizar un programa que lea los sueldos que cobra cada empleado e informe
cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
Además, el programa deberá informar el importe que gasta la empresa en sueldos
al personal.*/
public class EjercicioVectores {
	
	//5 empleados
	//1 ->100
	//2 ->300
	//3 ->500
	//4 ->600
	//5 ->200
	public static void main(String[] args) {
		int cantidadEmpleados = 0;
		int cantidadSueldosInvalidos=0;
		int cantidadSueldosMayores=0;
		int cantidadSueldosMenores=0;
		int sumatotiaSueldos=0;
		cantidadEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));
		System.out.println("cantidadEmpleados: "+cantidadEmpleados);
		
		int [] vSalarios = new int [cantidadEmpleados];
		for(int i=0; i<vSalarios.length; i++) {
			vSalarios[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario (entre $100 y $500) del empleado "+(i+1)));
			sumatotiaSueldos = sumatotiaSueldos+vSalarios[i];
			if (vSalarios[i]<100 || vSalarios[i]>500 ) {
				System.out.println("Salario no valido");
				cantidadSueldosInvalidos++;
			}else if(vSalarios[i]>=100 && vSalarios[i]<=300) {
				System.out.println("El salario es menor");
				cantidadSueldosMenores++;
				//cantidadSueldosMenores = cantidadSueldosMenores+1;
			}else if(vSalarios[i]>300 && vSalarios[i]<=500){
				System.out.println("El salario es mayor");
				cantidadSueldosMayores++;
			}
			
		}
		
		System.out.println("La cantidad de salarios entre 100 y 300 son: "+cantidadSueldosMenores);
		System.out.println("La cantidad de salarios entre 300 y 500 son: "+cantidadSueldosMayores);
		System.out.println("La cantidad de salarios invalidos son: "+cantidadSueldosInvalidos);
		System.out.println("La sumatoria de sueldos es: "+sumatotiaSueldos);
	}
	
}
