import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) {
		FileWriter f = null;
		//try catch finally
		try {
			f = new FileWriter("data.txt"); // checked exception �ʿ�
			f.write("Hello");
			// close�� �ϱ� ���� ���ܰ� �߻��� �� �ֱ⶧���� finally�� ó��
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// ���࿡ f�� null�� �ƴ϶��
			if (f != null) {
				try {
				f.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
