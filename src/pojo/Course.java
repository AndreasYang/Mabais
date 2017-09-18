package pojo;

import java.util.List;

public class Course {
	private Integer id;
	private String coursename;
	private Integer points;
	private List<Banji> banji;
	
	public Course() {
		super();
	}
	public Course(Integer id, String coursename, Integer points, List<Banji> banji) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.points = points;
		this.banji = banji;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	public List<Banji> getBanji() {
		return banji;
	}
	public void setBanji(List<Banji> banji) {
		this.banji = banji;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", coursename=" + coursename + ", points=" + points + ", banji=" + banji + "]";
	}
	
	

}
