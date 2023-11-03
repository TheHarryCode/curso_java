package curso_java;

import model.Persona;

public class ValidarTipoObjectoUsandoJava7 {
	public static void main(String[] args) {
		String nombre = "TheHarryCode";
		Long edad = 10l;
		Double peso = 100.8;
		String mensaje = getMessageFromOnType(peso);
		System.err.println(mensaje);
	}
	
	public static String getMessageFromOnType(Object obj) {
		if(obj instanceof String str) {
			return "Se recibio un Objecto de Tipo String "+str;
		}else if(obj instanceof Long) {
			return "Se recibio un Objecto de Tipo Long "+obj;
		}else if(obj instanceof Persona) {
			return "Se recibio un Objecto de Tipo Persona ";
		}else {
			return "Se recibio un Objecto no definido ";
		}
	}
}
