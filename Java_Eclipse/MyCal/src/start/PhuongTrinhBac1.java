package start;

public class PhuongTrinhBac1 {
	private float a, b; // ax + b = 0

	public PhuongTrinhBac1() {
		// TODO Auto-generated constructor stub
	}
	
	public String giaiPhuongTrinhBac1(float a, float b) {
		if(a==0) {
			if(b==0)return "Phuong trinh co so vo nghiem";
				
			else
				return "Phuong trinh vo nghiem";
		}
		else
			return "Phuong trinh co nghiem la: " + String.valueOf(-b/a);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhuongTrinhBac1 a = new PhuongTrinhBac1();
		System.out.print(a.giaiPhuongTrinhBac1(2, 4));
	}

}
