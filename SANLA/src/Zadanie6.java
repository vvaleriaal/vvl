import java.io.BufferedReader;
import java.io.InputStreamReader;

/*���������� �������� ���������, ������� ������� �� ������ �����.
����� �������� ������� �� ����� ���������� ���������.*/

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
