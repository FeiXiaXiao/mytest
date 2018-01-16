package cn.itcast.day07;

public class Course {
	private String courseId;//课程编号
	private String name;//名称
	private String time;//创建时间
	private String description;//课程描述
	public Course(){}
	public Course(String courseId,String name,String time,String description){
		this.courseId = courseId;
		this.name = name;
		this.time = time;
		this.description = description;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
