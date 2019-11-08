import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Необходимо написать программу, которая проверяет слово на
"палиндромность". Слово для проверки вводится вручную во
время выполнения программы.*/

public class Zadanie5 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		String str = reader.readLine();
		System.out.print(proverka(str));

	}
	static String proverka(String string)
	{
	return (new StringBuilder(string).reverse().toString()).equalsIgnoreCase(string)? "Да": "Нет";
	}

}
