import java.io.BufferedReader;
import java.io.InputStreamReader;

/*���������� �������� ����������� ��������, ������� �������
����� ��������� � �������� �� 1 �� N. [1,N] N � �������� ������� ��
����� ���������� ���������.

*������ � ������ ����� ������������������ ����� �������� (��� 0 � 1), � ������ ��������� � ����� ���� ����������.*/

public class Zadanie2 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������� N: ");
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
