
public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		int [] scores = {10,20,30};
		
		try{
			System.out.println(2);
//			System.out.println(scores[3]);		// try안에 뒤에 코드는 없는 값이 된다.
			System.out.println(3);		
			System.out.println(2/0);
			System.out.println(4);
		}catch(ArithmeticException e) {
			System.out.println("잘못된 계산이네요."+e.getMessage());
			e.printStackTrace();
		} 
		catch(Exception e) {
			System.out.println("먼가 이상합니다. 오류가 발생했습니다.");
		}
//		catch(ArithmeticException e) {		//2/0 exception
//			System.out.println("잘못된 계산이네요.");
//		} catch(ArrayIndexOutOfBoundsException e) {		//배열 exception
//			System.out.println("없는 값을 찾고 계시네요 ^^");
//		}

		System.out.println(5);

	}

}
