package synconizeVer2;

public class Pawn2 extends Thread {
	String s;
	King h;
	public Pawn2(King h,String s) {
		this.h=h;
		this.s=s;
	}
	public void run() {
		synchronized (h) {
			h.Data(s);
			
		}
	}
	public static void main(String[] args) {
		King k=new King();
		Pawn1 p1=new Pawn1(k, "Killed queen");
		Pawn2 p2=new Pawn2(k,"Killed knight");
		
		p1.start();
		p2.start();

	}

}
