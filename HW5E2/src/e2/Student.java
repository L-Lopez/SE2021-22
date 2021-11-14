package e2;

import java.util.List;

public class Student {
	public String name;
	public int StudentId;
	public Project[] project;
	public List<Course> courses; //final?
	public List<Exam> exam;
	
	public Student() {
		if (this.courses.size() < 1) {
			System.out.println("Each student needs to have at least one course!");
		}
		
		if (project.length > 1) {
			System.out.println("Each student has a maximum of one course!");
		}
	}
	
	public String getName() {
		
	}
	
	public Project getProjects() {
		
	}
}
