class Greeting {
	// public , {protected, default} - 객체지향때 배울 예정, private- 같은 클래스 안에서만 사용
	public static void hi() {
		System.out.println("Hi");
	}
}

public class AccessLevelModifiersMethod {

	public static void main(String[] args) {
		Greeting.hi();

	}

}
