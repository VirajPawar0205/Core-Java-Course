package synconizeVer2;

public class King extends Thread  { 
	public void Data(String d) {
		for(int i=1;i<=5;i++) {
			System.out.println(d);
			try {
				Thread.sleep(1200);
			}
			catch(Exception e) {}

		}
	}

}
