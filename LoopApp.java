
public class LoopApp {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println("===while===");
		int i = 0; 
		//..
		while (i < 3) {			//자유도가 높은 코드이다
		 	System.out.println(2);
			System.out.println(3);
//			i = i + 1;
			//..
			i++;
		}
		System.out.println("===for===");
		for(int j=0; j<3; j++) {			//코드가 길어질 수록 문제가 생길 가능성이 낮아짐
			System.out.println(2);
			System.out.println(3);
		}
		System.out.println(4);
	}

}
