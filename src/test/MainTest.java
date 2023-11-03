package test;

import javax.swing.JOptionPane;

public class MainTest {
	public static void main(String[] args) {
		int empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleados"));
		//Solución (FIX): Java: The left-hand side of an assignment must be a variable
		int [] sueldos = new int [empleados];
		
	}
}
