import java.io.BufferedReader;
import java.io.InputStreamReader;

/*���������� �������� ���������, ������� ��������� �������
����� � �������� �� 1 �� N. N � �������� ������� �� �����
���������� ���������.*/

public class Zadanie1 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������� N: ");
		int N = Integer.parseInt(reader.readLine());
		boolean isprime;
		int i,j;
		
		for(i=1; i < N; i++) {
	         isprime = true;
	             for (j=2; j <= i/j; j++)
	                      if((i%j) == 0) isprime = false;
	             if (isprime)
	                     System.out.println(i + " - ������� �����.");
	}
		
	}

}
