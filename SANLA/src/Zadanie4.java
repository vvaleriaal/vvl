import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Необходимо написать рекурсивный алгоритм для нахождения НОД
и НОК двух чисел. Два числа вводятся вручную во время
выполнения программы.*/

public class Zadanie4 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());
		
		System.out.println("НОД = "+NOD(a,b));
		System.out.println("НОК = "+NOK(a,b));
		
	}
		
	public static int NOD (int a, int b) {
		if (a==0) return b;
		return NOD(b%a,a);
	}
	
	static int NOK(int a, int b) {
		int nok = (a*b)/NOD(a,b); 
		return nok;
	}
}
