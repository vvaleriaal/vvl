import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Необходимо написать программу, которая удаляет из текста числа.
Текст вводится вручную во время выполнения программы.*/

public class Zadanie6 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		System.out.println(delete(str));
	}
	static String delete(String string)
	{
	return string.replaceAll("\\d","");
	}

}
