public class Course {
	
	private int course_id;
	private String course_name;
	private String description;
	private String course_cat;
	private String course_schedule;
	private boolean isAvailable;
	
	public Course(int course_id, String course_name, String description, String course_cat, String course_schedule, boolean isAvailable) {
		this.course_id = course_id;
		this.course_name = course_name;
		this.description = description;
		this.course_cat = course_cat;
		this.course_schedule = course_schedule;
		this.isAvailable = isAvailable;
	}
	
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getCourse_cat() {
		return course_cat;
	}

	public void setCourse_cat(String course_cat) {
		this.course_cat = course_cat;
	}
	
	public String getCourse_schedule() {
		return course_schedule;
	}

	public void setCourse_schedule(String course_schedule) {
		this.course_schedule = course_schedule;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}
//By yiqian