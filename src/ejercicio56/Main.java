package ejercicio56;

/**
 * Prueba las funcionalidades de la clase MiString.
 * @author Xuan
 */
public class Main
{

	public static void main(String[] args)
	{
		String cadena = "Prueba";
		System.out.println("Cadena: " + cadena);
		cadena = MiString.alReves(cadena);
		System.out.println("Cadena al reves: " + cadena);
		cadena = "Prueba";
		cadena = MiString.limpiaCaracteres(cadena, "rPb");
		System.out.println("Cadena sin los caracteres rPb: " + cadena);
		cadena = "Prueba";
		cadena = MiString.sustituye(cadena, 'a', 'o');
		System.out.println("Cadena con o en vez de a: " + cadena);
		cadena = "aaaaaa";
		if(MiString.todosIguales(cadena))
			System.out.println("Todos son iguales");
		else
			System.out.println("No todos son iguales");
		cadena = "aaabaa";
		if(MiString.todosIguales(cadena))
			System.out.println("Todos son iguales");
		else
			System.out.println("No todos son iguales");
		cadena = "Prueba con espacios";
		System.out.println("Cadena: " + cadena);
		cadena = MiString.quitaEspacios(cadena);
		System.out.println("Cadena sin espacios: " + cadena);
		cadena = "15478";
		System.out.println("Cadena: " + cadena);
		if(MiString.esNumeroEntero(cadena))
			System.out.println("Es un numero");
		else
			System.out.println("No es un numero");
		cadena = "15b7c8";
		System.out.println("Cadena: " + cadena);
		if(MiString.esNumeroEntero(cadena))
			System.out.println("Es un numero");
		else
			System.out.println("No es un numero");

	}

}
