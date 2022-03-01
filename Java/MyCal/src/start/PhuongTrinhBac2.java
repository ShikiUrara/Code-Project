package start;

public class PhuongTrinhBac2 {
	
	private float a, b, c; // ax^2 + bx + c = 0
	
	public PhuongTrinhBac2() {
		// TODO Auto-generated constructor stub
	}
	
	public String giaiPhuongTrinhBac2(float a, float b, float c) {
		if(a==0) {
			PhuongTrinhBac1 pt1 = new PhuongTrinhBac1();
			return pt1.giaiPhuongTrinhBac1(b, c);
		}
		else {
			float delta = b*b - 4*a*c;
			if(delta>0) {
				return "Phuong trinh co hai nghiem phan biet la:\n" + "x1 = " + String.valueOf((-b+Math.sqrt(delta))/2*a) + "/nx2 = " + String.valueOf((-b-Math.sqrt(delta))/2*a); 
			}
			else if(delta==0)
				return "Phuong trinh co nghiem kep la:\n" + "x = " + String.valueOf(-b/(2*a));
			else 
				return "Phuong trinh vo nghiem";
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhuongTrinhBac2 a = new PhuongTrinhBac2();
		System.out.print(a.giaiPhuongTrinhBac2(0, 2, 4));
	}

}
