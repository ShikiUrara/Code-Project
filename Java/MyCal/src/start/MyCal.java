/**
 * 
 */
package start;

/**
 * @author time0
 *
 */
public class MyCal {
	
	private int a, b; 
	
	public int geta() {
		return this.a;
	}
	
	public int getb() {
		return this.b;
	}
	public MyCal() {
		// TODO Auto-generated constructor stub
		this.a = 0;
		this.b = 0;
	}
	
    public int cong(int a, int b) {
        return a+b;
    }
    public int tru(int a, int b) {
        return a-b;
    }
    public int nhan(int a, int b) {
        return a*b;
    }
    public int chia(int a, int b) {
        return a/b;
    }
    public int min( int a, int b) {
        if(a>b) 
            return b;
        else
            return a;
    }
    public int max( int a, int b) {
        if(a>b) 
            return a;
        else
            return b;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
