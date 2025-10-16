import java.util.*;
public class SetsEG {
	public void setDemo()
	{
		//Set <Integer> st=new TreeSet<>();
		Set <Integer> st=new HashSet<>();
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(64);
		st.add(20);
		st.add(5);
		st.add(10);
		st.add(64);
		st.add(100);
		System.out.println(st);
		
		for(Integer i:st)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
	SetsEG ss=new SetsEG();
	ss.setDemo();

	}

}
