
public class Print1 {
	public  String delimiter ="";
	public Print1(String delimiter){
		this.delimiter = delimiter;
	}
	
	public  void A() {		//this => instance
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public  void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}
