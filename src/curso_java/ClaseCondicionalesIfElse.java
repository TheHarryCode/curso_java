package curso_java;

//Curso Java | Condiciones | Que Es y Como Implementar Los Condiciones If, Else, Else If en Java
public class ClaseCondicionalesIfElse {
	
	public static void main(String[] args) {
		//Si tiene edad entre 0-2 a�os imprima es un bebe
		//Si tiene edad entre 3-12 a�os imprima es un ni�o
		//Si tiene edad entre 13-17 a�os imprima es un joven
		
		int edad =17;
		if(edad > 17 ) {
			System.err.println("El usuario es MAYOR de edad");
		}else{
			System.err.println("El usuario es menor de edad");
			
			if(edad >=0 && edad <= 2) {
				System.err.println("El usuario es un bebe");
			}else if(edad >=3 && edad <= 12) {
				System.err.println("El usuario es un ni�o");
			}else if(edad >=13 && edad < 17) {
				System.err.println("El usuario es un joven");
			}else {
				System.err.println("Tiene 17");
			}
		}
	}
}
