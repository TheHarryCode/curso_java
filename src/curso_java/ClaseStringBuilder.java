package curso_java;

public class ClaseStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hola ").append("Mundo.")
		.append(" Este Canal es ").append("TheHarryCode");
		System.err.println(sb.toString());
	}
}
