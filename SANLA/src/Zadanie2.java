import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Необходимо написать рекурсивный алгоритм, который находит
числа Фибоначчи в ПРЕДЕЛАХ от 1 до N. [1,N] N – вводится вручную во
время выполнения программы.

*первый и второй члены последовательности равны единицам (или 0 и 1), а каждый следующий — сумме двух предыдущих.*/

public class Zadanie2 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите N: ");
		int N = Integer.parseInt(reader.readLine());
		for(int i=1; i<N; i++) {
			if(fib(i)<=N) {
				System.out.println(fib(i)+" ");
			}
		}
	}
	
	public static int fib(int N) {
		if(N==1) return 1;
		if(N==2) return 1;
		return fib(N - 1) + fib(N - 2);
	}

}
