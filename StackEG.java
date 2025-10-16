import java.util.Stack;

public class StackEG {
	public void show()
	{
		Stack <Integer> st=new Stack<>();
		st.push(10);
		st.push(50);
		st.push(65);
		st.push(14);
		st.push(23);
		st.push(44);
		System.out.println("Count = "+st.size());
		System.out.println("pop ="+st.pop());
		System.out.println("Count = "+st.size());
		
		int n=st.size();
		for(int i=0;i<n;i++)
		{
			System.out.println(st.pop());
		}
	}

	public static void main(String[] args) {
		StackEG e1=new StackEG();
		e1.show();

	}

}
