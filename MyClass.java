package polymorphism;
public class MyClass {
	public void a(char a){
		System.out.println("calling char function");
	}
	public void a(int a)	{
		System.out.println("callig int function ");
	}
	public void a(int a, int b){
		System.out.println("calling int function a amd b");
	}
	public void a(char a ,int b){
		System.out.println("Char int function");
	}
	public void a(int a,char b){
		System.out.println("int char function ");
	}
	public void a(float a,char b){
		System.out.println("float char function");
	}
	public static void main(String[] args) {
		MyClass m=new MyClass();
		m.a('g');
		m.a(5,'h');
		m.a('f',45);
		m.a(55f,'h');
		m.a(555);
		m.a(22,33);
	}
}  