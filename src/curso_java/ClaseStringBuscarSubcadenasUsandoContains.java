package curso_java;

public class ClaseStringBuscarSubcadenasUsandoContains {
	public static void main(String[] args) {
		String responseService = "FAIL_20230802_RESULT_1000";
		if(responseService.contains("OK")) {
			System.out.println("La respuesta fue exitosa");
		}else {
			System.err.println("La respuesta no fue exitosa o es desconocida");
		}
	}
}
