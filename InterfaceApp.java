interface Calculable {
	double PI =3.14;
	int sum(int v1, int v2);
}
class RealCal implements Calculable,Printable{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	public void print() {
		System.out.println("This is RealCal!!");
	}	
}
class AdvancedPrint implements Printable{
	public void print() {
		System.out.println("This is RealCal!!");
	}	
}
interface Printable{
	void print();
}
//class DummyCal implements Calculable{
//	public int sum(int v1, int v2) {
//		return 3;
//	}
//}

public class InterfaceApp {
	public static void main(String[] args) {

		Printable c = new AdvancedPrint();
//		System.out.println(c.sum(2, 1));
		c.print();
//		System.out.println(c.PI);
	}

}
