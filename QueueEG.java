import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class QueueEG {
	public void show()
	{
		Deque <Integer> st=new ArrayDeque<Integer>();
		st.add(10);
		st.add(50);
		st.add(65);
		st.add(14);
		st.add(23);
		st.add(44);
		st.remove();
		for(int d:st)
		{
			System.out.println(d);
		}
	}

	public static void main(String[] args) {
		QueueEG f1=new QueueEG();
		f1.show();

	}

}
