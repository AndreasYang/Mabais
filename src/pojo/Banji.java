package pojo;

import java.util.List;

public class Banji {
	private Integer banjiId;
	private String classname;
	private List<Student> student;
	private List<Course> course;
	
	public Banji() {
		super();
	}
	
	public Banji(Integer banjiId, String classname, List<Student> student, List<Course> course) {
		super();
		this.banjiId = banjiId;
		this.classname = classname;
		this.student = student;
		this.course = course;
	}
	
	public Integer getBanjiId() {
		return banjiId;
	}
	public void setBanjiId(Integer banjiId) {
		this.banjiId = banjiId;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Banji [banjiId=" + banjiId + ", classname=" + classname + ", student=" + student + ", course=" + course
				+ "]";
	}
	
	
	
	
	
	
}
