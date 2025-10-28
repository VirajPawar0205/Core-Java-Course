package data;

public class InputModel {
	private int roll;
	private String name,qul;
	private float eng,math,sci,avg;
	public InputModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InputModel(int roll, String name, String qul, float eng, float math, float sci,float avg) {
		super();
		this.roll = roll;
		this.name = name;
		this.qul = qul;
		this.eng = eng;
		this.math = math;
		this.sci = sci;
		this.avg = avg;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQul() {
		return qul;
	}
	public void setQul(String qul) {
		this.qul = qul;
	}
	public float getEng() {
		return eng;
	}
	public void setEng(float eng) {
		this.eng = eng;
	}
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public float getSci() {
		return sci;
	}
	public void setSci(float sci) {
		this.sci = sci;
	}

}
