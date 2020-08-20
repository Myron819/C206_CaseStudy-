
public class CourseSchedule {
	
	private int course_schedule_id;
	private Course course;
	private int price;
	private String start_date;
	private String end_date;
	private String start_time;
	private String end_time;
	private String location;
	
	public CourseSchedule(int course_schedule_id, Course course, int price, String start_date, String end_date,
			String start_time, String end_time, String location) {
		super();
		this.course_schedule_id = course_schedule_id;
		this.course = course;
		this.price = price;
		this.start_date = start_date;
		this.end_date = end_date;
		this.start_time = start_time;
		this.end_time = end_time;
		this.location = location;
	}
	public int getCourse_schedule_id() {
		return course_schedule_id;
	}
	public void setCourse_schedule_id(int course_schedule_id) {
		this.course_schedule_id = course_schedule_id;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
		
 //  
}
