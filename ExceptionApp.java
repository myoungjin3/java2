
public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		int [] scores = {10,20,30};
		
		try{
			System.out.println(2);
//			System.out.println(scores[3]);		// try�ȿ� �ڿ� �ڵ�� ���� ���� �ȴ�.
			System.out.println(3);		
			System.out.println(2/0);
			System.out.println(4);
		}catch(ArithmeticException e) {
			System.out.println("�߸��� ����̳׿�."+e.getMessage());
			e.printStackTrace();
		} 
		catch(Exception e) {
			System.out.println("�հ� �̻��մϴ�. ������ �߻��߽��ϴ�.");
		}
//		catch(ArithmeticException e) {		//2/0 exception
//			System.out.println("�߸��� ����̳׿�.");
//		} catch(ArrayIndexOutOfBoundsException e) {		//�迭 exception
//			System.out.println("���� ���� ã�� ��ó׿� ^^");
//		}

		System.out.println(5);

	}

}
