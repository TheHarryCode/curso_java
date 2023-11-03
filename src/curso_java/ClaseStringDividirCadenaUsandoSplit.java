package curso_java;

//Curso Java String Como Dividir Una Cadena Usando String.Split
public class ClaseStringDividirCadenaUsandoSplit {
	public static void main(String[] args) {
		String mensaje = "harry;mesa;12000;en mora";
		String [] datos = mensaje.split(";");
		for(int i = 0; datos.length > i; i++) {
			System.err.println("dato en posición ["+i+"] -> "+datos[i]);
		}
		
		String correo = "theharrycode@gmail.com";
		System.err.println("El correo antes del @ es: "+correo.split("@")[0]);
	}
}
