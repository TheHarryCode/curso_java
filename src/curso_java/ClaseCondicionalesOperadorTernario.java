package curso_java;

//Curso Java | Condiciones | Que Es y Como Implementar El Operador Ternario en Java
public class ClaseCondicionalesOperadorTernario {
	public static void main(String[] args) {
		int edad = 20;
		//mensaje = getMensaje(edad);
		String mensaje = edad >= 18 ? "El usuario es mayor de edad" : "El usuario es menor de edad";
		
		System.err.println(mensaje);
	}
	
	private static String getMensaje(int edad) {
		if(edad >= 18) {
			return "El usuario es mayor de edad";
		}else {
			return "El usuario es menor de edad";
		}
	}
}
