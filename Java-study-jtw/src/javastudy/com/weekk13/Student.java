package javastudy.com.weekk13;

public class Student {
	private static int serialNum = 1000;
	
	public String studentName;
	public int studentID;
	public int grade;
	
	public Student(String name) {
		this.studentName = name;
//		serialNum++;
		this.studentID = serialNum;
		serialNum++;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
	
}
