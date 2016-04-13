package ejercicio56;

/**
 * @author juan
 */
public class MiString
{

	/**
	 * Devuelve la cadena pasada como parametro pero al reves.
	 * @param cadena String Cadena original.
	 * @return String Cadena al reves.
	 */
	public static String alReves(String cadena)
	{
		StringBuilder cadenaInvertida = new StringBuilder("");
		for(int i = cadena.length() - 1; i >= 0; i--)
		{
			cadenaInvertida.append(cadena.charAt(i));
		}
		return cadenaInvertida.toString();
	}

	/**
	 * Devuelve la cadena pasada como primer parametro pero eliminando los caracteres
	 * pasados en la cadena como segundo parametro.
	 * @param cadena String Cadena principal.
	 * @param caracteres String Caracteres a eliminar.
	 * @return String Cadena principal sin los caracteres.
	 */
	public static String limpiaCaracteres(String cadena, String caracteres)
	{
		StringBuilder cadenaLimpia = new StringBuilder("");
		boolean coincide;
		for (int i = 0; i < cadena.length(); i++)
		{
			coincide = false;
			for (int j = 0; j < caracteres.length() && !coincide; j++)
			{
				if(cadena.charAt(i) == caracteres.charAt(j))
				{
					coincide = true;
				}
			}
			if(!coincide)
			{
				cadenaLimpia.append(cadena.charAt(i));
			}
		}
		return cadenaLimpia.toString();
	}

	/**
	 * Devuelve la cadena pasada como parametro pero sustituyendo todas las apariciones
	 * del primer char que pudiera haber por el segundo.
	 * @param cadena String Cadena original.
	 * @param caracterOriginal char Caracter a sustituir.
	 * @param caracterNuevo char Nuevo caracter.
	 * @return String Cadena con los caracteres sustituidos.
	 */
	public static String sustituye(String cadena, char caracterOriginal, char caracterNuevo)
	{
		StringBuilder cadenaCambiada = new StringBuilder("");
		for (int i = 0; i < cadena.length(); i++)
		{
			if(cadena.charAt(i) == caracterOriginal)
			{
				cadenaCambiada.append(caracterNuevo);
			}
			else
			{
				cadenaCambiada.append(cadena.charAt(i));
			}
		}
		return cadenaCambiada.toString();
	}

	/**
	 * Comprueba si todos los caracteres de la cadena son iguales.
	 * @param cadena String Cadena a comprobar.
	 * @return TRUE si todos son iguales (el mismo) FALSE si no lo son.
	 */
	public static boolean todosIguales(String cadena)
	{
		for (int i = 0; i < cadena.length() - 1; i++)
		{
			if(cadena.charAt(i) != cadena.charAt(i + 1))
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * Suprime los espacios en blanco que pudiera contener una cadena.
	 * @param cadena String Cadena con espacios.
	 * @return String Cadena sin espacios.
	 */
	public static String quitaEspacios(String cadena)
	{
		StringBuilder cadenaSinEspacios = new StringBuilder("");
		char espacio = ' ';
		for (int i = 0; i < cadena.length(); i++)
		{
			if(cadena.charAt(i) != espacio)
			{
				cadenaSinEspacios.append(cadena.charAt(i));
			}
		}
		return cadenaSinEspacios.toString();
	}

	/**
	 * Comprueba si todos los caracteres de una cadena son numericos.
	 * @param cadena String Cadena a comprobar si es numero.
	 * @return TRUE si es un numero FALSE si no lo es.
	 */
	public static boolean esNumeroEntero(String cadena)
	{
		if(cadena.length() == 0)
		{
			return false;
		}
		for (int i = 0; i < cadena.length(); i++)
		{
			if(!Character.isDigit(cadena.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}
}
