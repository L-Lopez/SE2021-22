package e2;

import java.util.List;

public class Course {
	public int id;
	public String name;
	public int maxCapacity;
	public boolean isFull;
	public Professor prof;
	public List<Student> student;
	public List<Exam> exam;
	
	public void course(int id, String name, int cap, Professor prof) {
		
	}
	
	public void enroll(Student student) {
		
	}
	
	public void apply(TA ta) {
		
	}
	
	public void setMaxCap(int max) {
		
	}
	
	public Professor getProf() {
		return this.prof;
	}
	
	public TA getTa() {
		
	}
	
	public void setNewTa(TA ta) {
		
	}
	
	public void setName(String s) {
		
	}
	
	
}
