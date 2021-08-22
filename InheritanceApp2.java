class Cal4 {
	int v1,v2;
	Cal4(int v1, int v2){
		System.out.println("Cal4 init!!");
		this.v1 = v1; this.v2 = v2;
	}
	public int sum() {return this.v1+v2;}
}

class Cal6 extends Cal4 {

	Cal6(int v1, int v2) {
			super(v1, v2);
			System.out.println("Cal6 init!!");
	}
	public int minus() {return this.v1-v2;}
	

}

public class InheritanceApp2 {
	public static void main(String[] args) {
		Cal4 c = new Cal4(2,1);
		Cal6 c3 = new Cal6(2,1);
		System.out.println(c3.sum());//3
		System.out.println(c3.minus());//1
	}

}

