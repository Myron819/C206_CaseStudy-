
public class Course {
	private String course_name;
	private int price;
	private String start_date;
	private String end_date;
	private String start_time;
	private String end_time;
	private String location;
	private String Category;

	public Course(String course_name, int price,String start_date,String end_date,String start_time,String end_time, String location,String Category) {
		this.course_name = course_name;
		this.price = price;
		this.start_date = "";
		this.end_date = "";
		this.start_time = "";
		this.end_time = "";
		this.location = location;
		this.Category = Category;
	}
	public String toString() {
		
		// Write your codes here
		return String.format("%-10s %-30s %-10s %-10s", );
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
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
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}


}
