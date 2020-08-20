
public class CourseSchedule {
	
	private String course_name;
	private String price;
	private String start_date;
	private String end_date;
	private String start_time;
	private String end_time;
	private int location;
	
	
	

	public CourseSchedule(String price, String start_date, String end_date, String start_time, String end_time, int location) {
		super();
		this.price = price;
		this.start_date = start_date;
		this.end_date = end_date;
		this.start_time = start_time;
		this.end_time = end_time;
		this.location = location;
	}




	public String getCourse_name() {
		return course_name;
	}
	
	
		
 //  
}
