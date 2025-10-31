package synconizeVer2;

public class Pawn1 extends Thread {
	String s;
	King h;
	public Pawn1(King h,String s) {
		this.h=h;
		this.s=s;
	}
	public void run() {
		synchronized (h) {
			h.Data(s);
			
		}
	}
	

}
