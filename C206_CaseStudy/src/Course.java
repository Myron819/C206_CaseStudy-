public class Course {
	
	private int course_code;
	private String course_title;
	private String description;
	private CourseCategory course_cat;
	private CourseSchedule course_schedule;
	private String course_duration;
	private String pre_requisite_course;
	private boolean isAvailable;
	
	public Course(int course_code, String course_title, String description, CourseCategory course_cat, CourseSchedule course_schedule, String course_duration, String pre_requisite_course) {
		this.course_code = course_code;
		this.course_title = course_title;
		this.description = description;
		this.course_cat = course_cat;
		this.course_schedule = course_schedule;
		this.course_duration = course_duration;
		this.pre_requisite_course = pre_requisite_course;
		this.isAvailable = true;
	}
	
	public Course(int course_code, String course_title, String description, CourseCategory course_cat, String course_duration, String pre_requisite_course) {
		this.course_code = course_code;
		this.course_title = course_title;
		this.description = description;
		this.course_cat = course_cat;
		this.course_duration = course_duration;
		this.pre_requisite_course = pre_requisite_course;
		this.isAvailable = true;
	}
	
	
	
	public int getCourse_code() {
		return course_code;
	}
	
	public String getCourse_title() {
		return course_title;
	}
	public void setCourse_title(String course_title) {
		this.course_title = course_title;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public CourseCategory getCourse_cat() {
		return course_cat;
	}

	public void setCourse_cat(CourseCategory course_cat) {
		this.course_cat = course_cat;
	}
	
	public CourseSchedule getCourse_schedule() {
		return course_schedule;
	}

	public void setCourse_schedule(CourseSchedule course_schedule) {
		this.course_schedule = course_schedule;
	}
	
	public String getCourse_duration() {
		return course_duration;
	}

	public void setCourse_duration(String course_duration) {
		this.course_duration = course_duration;
	}
	
	public String getPre_requisite_course() {
		return pre_requisite_course;
	}

	public void setPre_requisite_course(String pre_requisite_course) {
		this.pre_requisite_course = pre_requisite_course;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}
//By yiqian